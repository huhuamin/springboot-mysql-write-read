package com.huhuamin.study.springbootmysqlwriteread.aop;


import com.huhuamin.study.springbootmysqlwriteread.annotation.DynamicDataSources;
import com.huhuamin.study.springbootmysqlwriteread.config.DynamicDruidConfiguration;
import com.huhuamin.study.springbootmysqlwriteread.config.support.DefaultRoutingDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * @ClassName : DataSourceAspect  //类名
 * @Description : 动态切换数据源 拦截器 //描述
 * @Author : 胡化敏（175759041@qq.com）
 * @Date: 2020年05月10日08:36 //时间
 * @see DynamicDruidConfiguration
 */
@Component
@Aspect
public class DataSourceAspect {

    @Around("@annotation(com.huhuamin.study.springbootmysqlwriteread.annotation.DynamicDataSources)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DynamicDataSources dataSource = method.getAnnotation(DynamicDataSources.class);

        if (null != dataSource) {
            //预定大于配置，
            // 当在方法上使用 @DynamicDataSources 如果 update,save 使用主库，
            // 由于我们系统有删除标识，没有删除功能，如果你的系统里面有，可以修改这里的逻辑
            if (StringUtils.isEmpty(dataSource.value()) && (method.getName().contains("save") || method.getName().contains("update"))) {
                DefaultRoutingDataSource.setDataSource(DynamicDruidConfiguration.DEFAULT_MASTER);
            } else {
                DefaultRoutingDataSource.setDataSource(dataSource.value());
            }
        }
        /**
         *  如果没有注解{@link DynamicDruidConfiguration#dataSource} 配置了默认的数据源
         */

        try {
            return point.proceed();
        } finally {
            DefaultRoutingDataSource.clearDataSource();
        }
    }
}
