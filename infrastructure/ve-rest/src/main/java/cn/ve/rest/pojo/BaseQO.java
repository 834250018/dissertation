package cn.ve.rest.pojo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ve
 * @date 2021/8/3
 */
@Data
public abstract class BaseQO<T> implements Serializable {

    private static final long serialVersionUID = -7591768609187901049L;
    /**
     * 创建开始时间
     */
    private Long createTimeBegin;
    /**
     * 创建截止时间
     */
    private Long createTimeEnd;
    /**
     * 页面大小
     */
    private Integer pageSize;

    /**
     * 页码
     */
    private Integer pageNo;

    public Page<T> getPageQO() {
        return new Page<>(pageNo, pageSize, Boolean.TRUE);
    }
}
