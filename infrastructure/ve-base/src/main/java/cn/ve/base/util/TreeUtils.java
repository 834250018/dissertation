package cn.ve.base.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ve
 * @date 2021/8/6
 */
public enum TreeUtils {
    ;

    private static <T> void convertTree(T root, List<T> allElement, Function<T, ?> getId, Function<T, ?> getParentId, BiFunction<T, List<T>, ?> setChildren) {
        Object rootId = getId.apply(root);
        List<T> subList = allElement
                .stream()
                .filter(item -> getParentId.apply(item).equals(rootId))
                .collect(Collectors.toList());
        setChildren.apply(root, subList);
        for (T e : subList) {
            convertTree(e, allElement, getId, getParentId, setChildren);
        }
    }

    @Accessors(chain = true)
    @Data
    public static class A {
        private Long id;
        private Long parentId;
        private List<A> aList;
    }

    @Accessors(chain = true)
    @Data
    public static class B {
        private Long idd;
        private Long parentffId;
        private List<B> bList;
    }

    @Accessors(chain = true)
    @Data
    public static class C {
        private String idd;
        private String parentffId;
        private List<C> bList;
    }
}
