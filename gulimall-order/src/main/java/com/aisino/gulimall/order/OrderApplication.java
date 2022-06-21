package com.aisino.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuxiang
 * @date 2022/6/20 1:13 AM
 * @email 1325668250@qq.com
 */
@SpringBootApplication
@MapperScan("com.aisino.gulimall.order.dao")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
