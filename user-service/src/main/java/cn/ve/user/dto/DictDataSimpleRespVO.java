package cn.ve.user.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class DictDataSimpleRespVO implements Serializable {

    private static final long serialVersionUID = -2563771726241942009L;
    /**
     * 字典类型"
     */
    private String dictType;

    /**
     * 字典键值"
     */
    private String value;

    /**
     * 字典标签"
     */
    private String label;

    /**
     * 颜色类型"
     */
    private String colorType;
    /**
     * css 样式
     */
    private String cssClass;

}
