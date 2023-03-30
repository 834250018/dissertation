package cn.ve.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:11:27
 */
@Data
public class QuerySystemDictDataPageEntityOut implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
