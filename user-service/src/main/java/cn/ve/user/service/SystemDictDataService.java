package cn.ve.user.service;

import cn.ve.user.dal.entity.SystemDictData;
import cn.ve.user.param.SystemDictDataQO;
import java.util.List;

public interface SystemDictDataService {

    int insert(SystemDictData systemDictData);
    
    int update(SystemDictData systemDictData);
    
    void updateStatus(Long id, Integer status);

    void deleteById(Long id);
}

