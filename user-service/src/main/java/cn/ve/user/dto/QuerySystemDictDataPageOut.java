package cn.ve.user.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 字典数据表(SystemDictData)实体类
 *
 * @author ve
 * @since 2022-12-30 10:11:27
 */
@Data
@Accessors(chain = true)
public class QuerySystemDictDataPageOut implements Serializable {

    /**
    * 总数
    */
    private Long total;

    /**
    * 数据
    */
    private List<QuerySystemDictDataPageEntityOut> entities;

}
