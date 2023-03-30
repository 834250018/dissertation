package cn.ve.user.controller;

import cn.ve.base.util.CopyUtils;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.rest.pojo.BaseController;
import cn.ve.user.dal.entity.SystemDictData;
import cn.ve.user.dal.mapper.SystemDictDataMapper;
import cn.ve.user.dto.DictDataSimpleRespVO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class DictController extends BaseController {

    @Resource
    SystemDictDataMapper systemDictDataMapper;

}