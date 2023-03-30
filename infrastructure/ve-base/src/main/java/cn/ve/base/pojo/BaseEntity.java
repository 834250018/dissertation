package cn.ve.base.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

@Data
@FieldNameConstants
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6803798551908677729L;
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 创建用户id
     */
    @TableField(fill = FieldFill.INSERT)
    private Long creatorId;

    /**
     * 更新用户id
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updaterId;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createTime;

    /**
     * 版本号
     */
    @Version
    @TableField(fill = FieldFill.INSERT, update = "1")
    private Integer versions;

    /**
     * 是否删除  0：未删除  1：已删除
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    /**
     * 创建用户名称
     */
    @TableField(fill = FieldFill.INSERT)
    private String creatorName;

    /**
     * 更新用户名称
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updaterName;

    /**
     * 备注
     */
    private String remark;
}
