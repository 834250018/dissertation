package cn.ve.user.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import lombok.experimental.Accessors;
import java.util.List;

/**
 * 字典类型表(SystemDictType)实体类
 *
 * @author ve
 * @since 2022-12-30 11:55:16
 */
@Data
@Accessors(chain = true)
public class SystemDictTypePageOut implements Serializable {

    /**
    * 总数
    */
    private Long total;

    /**
    * 数据
    */
    private List<SystemDictTypePageEntityOut> entities;

}
