package cn.ve.user.param;

import lombok.Data;
import java.io.Serializable;

/**
 * 字典类型表(SystemDictType)实体类
 *
 * @author ve
 * @since 2022-12-30 11:55:15
 */
@Data
public class SystemDictTypeUpdateStatusForm implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 状态: 0.未启用, 1.已启用
     */
    private Integer status;

}
