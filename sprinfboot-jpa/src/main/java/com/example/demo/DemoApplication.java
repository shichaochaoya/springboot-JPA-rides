package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})//如果配置了数据库连接而没有配置数据源就会启动报错，需添加exclude
@EnableCaching
public class DemoApplication {
private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("------------启动成功-------------------");
    }

}
