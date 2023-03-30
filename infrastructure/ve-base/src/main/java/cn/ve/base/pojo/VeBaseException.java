package cn.ve.base.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.*;

/**
 * @author ve
 * @date 2018/7/25 15:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VeBaseException extends RuntimeException implements Serializable {

    public static final Map<String, String> exceptionMap = new HashMap<>();

    static {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("exception.properties");
        ResourceBundle resourceBundle = null;
        try {
            resourceBundle = new PropertyResourceBundle(inputStream);
        } catch (IOException e) {

        }
        Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            String s = keys.nextElement();
            System.out.println(s + " = " + resourceBundle.getString(s));
            exceptionMap.put(s, resourceBundle.getString(s));
        }
    }

    private String code;
    private String msg;

    private static final long serialVersionUID = 1L;

    public VeBaseException(Throwable cause) {
        super(cause);
        init("500", "error");
    }

    private void init(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public VeBaseException(String code, Object... additionalString) {
        String msg = exceptionMap.get(code);
        String format = String.format(msg, additionalString);
        init(code, format);
    }

    // 重写此方法返回this,业务异常不打印堆栈信息提高速度
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}