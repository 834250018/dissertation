package cn.ve.user.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:11:29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemDictDataUpdateForm extends SystemDictDataCreateForm {

 /**
     * 主键id
     */
    private Long id;

}
