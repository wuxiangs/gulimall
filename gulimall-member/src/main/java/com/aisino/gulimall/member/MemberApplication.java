package com.aisino.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuxiang
 * @date 2022/6/20 1:14 AM
 * @email 1325668250@qq.com
 */
@SpringBootApplication
@MapperScan("com.aisino.gulimall.member.dao")
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
