package com.hzhimingo.playground;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.hzhimingo.playground.dao")
public class DistributeLockStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributeLockStockApplication.class, args);
    }
}
