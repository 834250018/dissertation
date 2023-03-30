package cn.ve.user.param;

import lombok.Data;
import java.io.Serializable;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:11:29
 */
@Data
public class SystemDictDataUpdateStatusForm implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 状态: 0.未启用, 1.已启用
     */
    private Integer status;

}
