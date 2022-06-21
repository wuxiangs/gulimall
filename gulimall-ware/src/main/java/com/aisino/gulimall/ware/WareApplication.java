package com.aisino.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuxiang
 * @date 2022/6/20 1:15 AM
 * @email 1325668250@qq.com
 */
@SpringBootApplication
@MapperScan("com.aisino.gulimall.ware.dao")
public class WareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WareApplication.class,args);
    }
}
