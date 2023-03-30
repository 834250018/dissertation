package cn.ve.user.service.impl;

import cn.ve.user.dal.entity.SystemDictData;
import cn.ve.user.dal.mapper.SystemDictDataMapper;
import cn.ve.user.service.SystemDictDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SystemDictDataServiceImpl implements SystemDictDataService {

    @Resource
    private SystemDictDataMapper  systemDictDataMapper;

    @Override
    public int insert(SystemDictData systemDictData) {
        return systemDictDataMapper.insert(systemDictData);
    }
    
    @Override
    public int update(SystemDictData systemDictData) {
        return systemDictDataMapper.updateById(systemDictData);
    }
    
    @Override
    public void updateStatus(Long id, Integer status) {
        // systemDictDataMapper.updateStatus(id, status);
    }

    @Override
    public void deleteById(Long id) {
        systemDictDataMapper.deleteById(id);
    }

}

