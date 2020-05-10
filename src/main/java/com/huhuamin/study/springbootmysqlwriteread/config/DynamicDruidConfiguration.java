package com.huhuamin.study.springbootmysqlwriteread.config;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.huhuamin.study.springbootmysqlwriteread.config.support.DefaultRoutingDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : DynamicDruidConfiguration  //类名
 * @Description : Druid 动态数据源配置  //描述
 * @Author : 胡化敏（175759041@qq.com）
 * @Date: 2020年05月10日08:19  //时间
 *
 */
@Configuration
public class DynamicDruidConfiguration {
    public static final String DEFAULT_MASTER = "hhm-master";
    public static final String DEFAULT_REPLIC = "hhm-replic";

    @Bean
    @ConfigurationProperties("spring.datasource.druid." + DEFAULT_MASTER)
    public DataSource hhmMasterDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid." + DEFAULT_REPLIC)
    public DataSource hhmReplicDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DefaultRoutingDataSource dataSource(DataSource hhmMasterDataSource, DataSource hhmReplicDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DEFAULT_MASTER, hhmMasterDataSource);
        targetDataSources.put(DEFAULT_REPLIC, hhmReplicDataSource);
        /**
         * 这里第一个参数是默认的数据源，由于我们系统metadata，是元数据模块，一般是读多写少，所以这里 默认使用从库读
         */
        return new DefaultRoutingDataSource(hhmReplicDataSource, targetDataSources);
    }
}
