package cn.ve.user.dal.entity;

import cn.ve.base.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:21:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldNameConstants
@Accessors(chain = true)
public class SystemDictData extends BaseEntity {
    private static final long serialVersionUID = 972016524832804617L;
    /**
    * 主键id
    */
    private Long id;
    /**
    * 字典排序
    */
    private Integer sort;
    /**
    * 字典标签
    */
    private String label;
    /**
    * 字典键值
    */
    private String value;
    /**
    * 字典类型
    */
    private String dictType;
    /**
    * 状态（0正常 1停用）
    */
    private Integer status;
    /**
    * 颜色类型
    */
    private String colorType;
    /**
    * css 样式
    */
    private String cssClass;

}
