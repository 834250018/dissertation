package cn.ve.user.dal.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import cn.ve.base.pojo.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * 字典类型表(SystemDictType)实体类
 *
 * @author ve
 * @since 2022-12-30 11:55:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@FieldNameConstants
public class SystemDictType extends BaseEntity {
    private static final long serialVersionUID = -20263994763345480L;
    /**
    * 字典主键
    */
    private Long id;
    /**
    * 字典名称
    */
    private String name;
    /**
    * 字典类型
    */
    private String type;
    /**
    * 状态（0正常 1停用）
    */
    private Integer status;
    /**
    * 创建人id
    */
    private Long creatorId;
    /**
    * 修改人id
    */
    private Long updaterId;
    /**
    * 创建人名称
    */
    private String creatorName;
    /**
    * 修改人名称
    */
    private String updaterName;
    /**
    * 创建时间
    */
    private Long createTime;
    /**
    * 修改时间
    */
    private Long updateTime;
    /**
    * 是否被删除:0.未删除;1.已删除
    */
    private Integer deleted;
    /**
    * 版本号
    */
    private Integer versions;
    /**
    * 备注
    */
    private String remark;

}
