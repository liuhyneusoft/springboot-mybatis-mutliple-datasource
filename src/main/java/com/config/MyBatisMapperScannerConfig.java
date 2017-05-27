package com.config;

import com.bz.interf.MRepository;
import com.bz.interf.SRepository;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/12/17.
 */
@Configuration
@AutoConfigureAfter({MasterConfig.class,SlaveConfig.class})  //我这里使用2个类配置DataSource
public class MyBatisMapperScannerConfig {

    /**
     * - 设置SqlSessionFactory；
     * - 设置dao所在的package路径；
     * - 关联注解在dao类上的Annotation名字；
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer1() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("masterSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.bz.mapper");
        mapperScannerConfigurer.setAnnotationClass(MRepository.class);//设置一个注解。用来区分是那个DataSource
        return mapperScannerConfigurer;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer2() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("slaveSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.bz.mapper");
        mapperScannerConfigurer.setAnnotationClass(SRepository.class);//设置一个注解。用来区分是那个DataSource
        return mapperScannerConfigurer;
    }

}
