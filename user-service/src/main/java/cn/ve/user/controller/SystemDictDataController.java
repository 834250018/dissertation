package cn.ve.user.controller;

import cn.hutool.http.Header;
import cn.ve.base.util.CopyUtils;
import cn.ve.base.util.StringConstant;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.rest.util.CsvUtils;
import cn.ve.user.dal.entity.SystemDictData;
import cn.ve.user.dal.mapper.SystemDictDataMapper;
import cn.ve.user.dto.DictDataSimpleRespVO;
import cn.ve.user.dto.QuerySystemDictDataPageEntityOut;
import cn.ve.user.dto.QuerySystemDictDataPageOut;
import cn.ve.user.dto.SystemDictDataDTO;
import cn.ve.user.param.SystemDictDataCreateForm;
import cn.ve.user.param.SystemDictDataQO;
import cn.ve.user.param.SystemDictDataUpdateForm;
import cn.ve.user.param.SystemDictDataUpdateStatusForm;
import cn.ve.user.service.SystemDictDataService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Slf4j
@Validated
@RestController
@RequestMapping
public class SystemDictDataController  {

    @Autowired
    private SystemDictDataService  systemDictDataService;
    @Resource
    private SystemDictDataMapper systemDictDataMapper;

    @PostMapping("/systemDictData/v1_0/insertOne")
    public void insert(@RequestBody @Valid SystemDictDataCreateForm form) {
         systemDictDataService.insert(CopyUtils.copy(form, SystemDictData.class));
    }

    @PostMapping("/systemDictData/v1_0/listAllSimple")
    public CommonResult<List<DictDataSimpleRespVO>> getSimpleDictDatas() {
        List<SystemDictData> systemDictData = systemDictDataMapper.selectList(
            new LambdaQueryWrapper<>()
        );
        return CommonResult.success(
            CopyUtils.copyList(
                systemDictData,
                DictDataSimpleRespVO::new
            )
        );
    }

    @PostMapping("/systemDictData/v1_0/one")
    public CommonResult<SystemDictDataDTO> queryById(@RequestParam Long id) {
        SystemDictDataDTO copy = CopyUtils.copy(
            systemDictDataMapper.selectOne(
                new LambdaQueryWrapper<SystemDictData>()
                    .eq(SystemDictData::getId, id)
            ),
            SystemDictDataDTO.class
        );
        return CommonResult.success(copy);
    }

    @PostMapping("/systemDictData/v1_0/page")
    public CommonResult<QuerySystemDictDataPageOut> queryPage(@ModelAttribute@Valid SystemDictDataQO qo) {
        Page<SystemDictData> page = systemDictDataMapper.selectPage(
            qo.getPageQO(),
            new LambdaQueryWrapper<>()
        );
        QuerySystemDictDataPageOut result = new QuerySystemDictDataPageOut()
            .setTotal(page.getTotal())
            .setEntities(CopyUtils.copyList(
                page.getRecords(),
                QuerySystemDictDataPageEntityOut::new
            ));
        return CommonResult.success(result);
    }
    
    private static final String[] TITLES = new String[] {"主键", "名称"};
    private static final String[] PROPERTIES = new String[] {"id", "name"};
    private static final Map<String, Function<String, String>> FUNCTION_MAP =
        new HashMap<String, Function<String, String>>() {{
            put("id", value -> {
                if (Long.parseLong(value) == 1L) {
                    return "测试";
                } else {
                    return value;
                }
            });
        }};

    @PostMapping("/systemDictData/v1_0/exportCsv")
    public void exportCsv(HttpServletResponse response,@ModelAttribute @Valid SystemDictDataQO qo) throws Exception {
        response.setHeader(Header.CONTENT_ENCODING.getValue(), StandardCharsets.UTF_8.displayName());
        response.setHeader(Header.CONTENT_DISPOSITION.getValue(),
            StringConstant.CONTENT_DISPOSITION_VALUE_PREFIX + System.currentTimeMillis() + StringConstant.CSV_SUFFIX);
        CsvUtils<SystemDictDataDTO> csvUtils = new CsvUtils<>(response.getOutputStream(), TITLES, PROPERTIES, FUNCTION_MAP, SystemDictDataDTO.class);
        // csvUtils.writeData(() -> BeanUtils.copyList(systemDictDataService.queryAll(qo), SystemDictDataDTO.class), qo, 10);
    }
    
    @PostMapping("/systemDictData/v1_0/updateOne")
    public void update(@RequestBody @Valid SystemDictDataUpdateForm form) {
         systemDictDataService.update(CopyUtils.copy(form, SystemDictData.class));
    }
    
    @PostMapping("/systemDictData/v1_0/updateStatus")
    public void update(@RequestBody @Valid SystemDictDataUpdateStatusForm form) {
         systemDictDataService.updateStatus(form.getId(), form.getStatus());
    }
    
    @PostMapping("/systemDictData/v1_0/remove")
    public void deleteById(@RequestParam Long id) {
         systemDictDataService.deleteById(id);
    }

}

