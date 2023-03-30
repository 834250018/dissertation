package cn.ve.user.param;

import cn.ve.rest.pojo.BaseQO;
import cn.ve.user.dal.entity.SystemDictData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:11:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemDictDataQO extends BaseQO<SystemDictData> {
    
}
