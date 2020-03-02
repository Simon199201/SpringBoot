package com.itheima.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Collection;
import java.util.Map;

public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //判断RedisTemplate坐标是否导入，如果是，则返回true，否则返回false
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        System.out.println(annotationAttributes);
        String[] value = new String[0];
        if (annotationAttributes != null) {
            value = (String[]) annotationAttributes.get("value");
        }
        try {
            for (String item : value) {
                Class.forName(item);
            }
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
