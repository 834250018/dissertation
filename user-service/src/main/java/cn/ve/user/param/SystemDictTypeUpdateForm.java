package cn.ve.user.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典类型表(SystemDictType)实体类
 *
 * @author ve
 * @since 2022-12-30 11:55:15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemDictTypeUpdateForm extends SystemDictTypeCreateForm {

 /**
     * 主键id
     */
    private Long id;

}
