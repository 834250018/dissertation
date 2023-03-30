package cn.ve.user.service;

import cn.ve.user.dal.entity.SystemDictType;
import cn.ve.user.param.SystemDictTypeQO;
import java.util.List;

public interface SystemDictTypeService {

    int insert(SystemDictType systemDictType);
    
    int update(SystemDictType systemDictType);
    
    void updateStatus(Long id, Integer status);

    void deleteById(Long id);

}

