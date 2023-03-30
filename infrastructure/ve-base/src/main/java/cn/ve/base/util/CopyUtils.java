package cn.ve.base.util;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.lang.copier.Copier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ve
 * @date 2021/8/6
 */
public class CopyUtils {

    public static <T> T copy(Object source, Class<T> tClass, String... ignoreProperties) {
        if (source == null) {
            return null;
        }
        return BeanUtil.copyProperties(source, tClass, ignoreProperties);
    }

    public static <T> List<T> copyList(List<?> sources, Copier<T> copier) {
        if (CollectionUtil.isEmpty(sources)) {
            return new ArrayList<>();
        }
        List<T> result = new ArrayList<>(sources.size());
        for (Object source : sources) {
            T copy = copier.copy();
            BeanUtil.copyProperties(source, copy);
            result.add(copy);
        }
        return result;
    }
}
