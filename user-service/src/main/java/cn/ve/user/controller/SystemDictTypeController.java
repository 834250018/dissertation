package cn.ve.user.controller;

import cn.hutool.http.Header;
import java.nio.charset.StandardCharsets;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.user.dto.SystemDictTypeDTO;
import cn.ve.user.dto.SystemDictTypePageEntityOut;
import cn.ve.user.dto.SystemDictTypePageOut;
import cn.ve.user.dal.entity.SystemDictType;
import cn.ve.user.param.SystemDictTypeCreateForm;
import cn.ve.base.util.CopyUtils;
import cn.ve.user.param.SystemDictTypeUpdateForm;
import cn.ve.user.param.SystemDictTypeUpdateStatusForm;
import cn.ve.user.param.SystemDictTypeQO;
import cn.ve.user.service.SystemDictTypeService;
import cn.ve.user.dal.mapper.SystemDictTypeMapper;
import cn.ve.base.util.StringConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import cn.ve.rest.util.CsvUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

@Slf4j
@Validated
@RestController
@RequestMapping("/systemDictType")
public class SystemDictTypeController  {

    @Autowired
    private SystemDictTypeService  systemDictTypeService;
    @Resource
    private SystemDictTypeMapper  systemDictTypeMapper;

    @PostMapping("/v1_0/insertOne")
    public void insert(@RequestBody @Valid SystemDictTypeCreateForm form) {
        systemDictTypeService.insert(CopyUtils.copy(form, SystemDictType.class));
    }

    @GetMapping("/v1_0/one")
    public CommonResult<SystemDictTypeDTO> queryById(@RequestParam Long id) {
        SystemDictTypeDTO copy = CopyUtils.copy(
            systemDictTypeMapper.selectOne(
                new LambdaQueryWrapper<SystemDictType>()
                    .eq(SystemDictType::getId, id)
            ),
            SystemDictTypeDTO.class
        );
        return CommonResult.success(copy);
    }

    @GetMapping("/v1_0/page")
    public CommonResult<SystemDictTypePageOut> queryPage(@ModelAttribute@Valid SystemDictTypeQO qo) {
        Page<SystemDictType> page = systemDictTypeMapper.selectPage(
            qo.getPageQO(),
            new LambdaQueryWrapper<>()
        );
        SystemDictTypePageOut result = new SystemDictTypePageOut()
            .setTotal(page.getTotal())
            .setEntities(CopyUtils.copyList(
                page.getRecords(),
                SystemDictTypePageEntityOut::new
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

    @GetMapping("/v1_0/exportCsv")
    public void exportCsv(HttpServletResponse response,@ModelAttribute @Valid SystemDictTypeQO qo) throws Exception {
        response.setHeader(Header.CONTENT_ENCODING.getValue(), StandardCharsets.UTF_8.displayName());
        response.setHeader(Header.CONTENT_DISPOSITION.getValue(),
            StringConstant.CONTENT_DISPOSITION_VALUE_PREFIX + System.currentTimeMillis() + StringConstant.CSV_SUFFIX);
        CsvUtils<SystemDictTypeDTO> csvUtils = new CsvUtils<>(response.getOutputStream(), TITLES, PROPERTIES, FUNCTION_MAP, SystemDictTypeDTO.class);
        // csvUtils.writeData(() -> BeanUtils.copyList(systemDictTypeService.queryAll(qo), SystemDictTypeDTO.class), qo, 10);
    }
    
    @PostMapping("/v1_0/updateOne")
    public void update(@RequestBody @Valid SystemDictTypeUpdateForm form) {
        systemDictTypeService.update(CopyUtils.copy(form, SystemDictType.class));
    }
    
    @PostMapping("/v1_0/updateStatus")
    public void update(@RequestBody @Valid SystemDictTypeUpdateStatusForm form) {
        // systemDictTypeService.updateStatus(form.getId(), form.getStatus());
    }
    
    @PostMapping("/v1_0/remove")
    public void deleteById(@RequestParam Long id) {
        systemDictTypeService.deleteById(id);
    }

}

