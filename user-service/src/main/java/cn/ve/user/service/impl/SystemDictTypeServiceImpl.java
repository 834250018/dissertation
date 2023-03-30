package cn.ve.user.service.impl;

import cn.ve.user.dal.entity.SystemDictType;
import cn.ve.user.param.SystemDictTypeQO;
import cn.ve.user.dal.mapper.SystemDictTypeMapper;
import cn.ve.user.service.SystemDictTypeService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class SystemDictTypeServiceImpl implements SystemDictTypeService {

    @Resource
    private SystemDictTypeMapper  systemDictTypeMapper;

    @Override
    public int insert(SystemDictType systemDictType) {
        return systemDictTypeMapper.insert(systemDictType);
    }
    
    @Override
    public int update(SystemDictType systemDictType) {
        return systemDictTypeMapper.updateById(systemDictType);
    }
    
    @Override
    public void updateStatus(Long id, Integer status) {
        // systemDictTypeMapper.updateStatus(id, status);
    }

    @Override
    public void deleteById(Long id) {
        systemDictTypeMapper.deleteById(id);
    }

}

