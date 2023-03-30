package cn.ve.base.config;

import cn.ve.base.pojo.BaseEntity;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author ve
 * @date 2022/12/28
 */
@Component
public class DateMetaObjectHandler implements MetaObjectHandler {
        @Override
        public void insertFill(MetaObject metaObject) {
                this.setFieldValByName(BaseEntity.Fields.createTime, System.currentTimeMillis(), metaObject);
                this.setFieldValByName(BaseEntity.Fields.updateTime, System.currentTimeMillis(), metaObject);
                this.setFieldValByName(BaseEntity.Fields.deleted, 0, metaObject);
                this.setFieldValByName(BaseEntity.Fields.versions, 0, metaObject);
        }

        @Override
        public void updateFill(MetaObject metaObject) {
                this.setFieldValByName(BaseEntity.Fields.updateTime, System.currentTimeMillis(), metaObject);
        }
}
