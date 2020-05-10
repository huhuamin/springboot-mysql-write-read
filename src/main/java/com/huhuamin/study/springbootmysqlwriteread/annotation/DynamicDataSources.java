package com.huhuamin.study.springbootmysqlwriteread.annotation;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

/**
 * @ClassName : 动态数据源注解  //类名
 * @Description : 动态数据源注解  //描述
 * @Author : 胡化敏（175759041@qq.com）
 * @Date: 2020年05月10日08:35  //时间
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface DynamicDataSources {
    String value() default "";
}
