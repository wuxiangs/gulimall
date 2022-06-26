package com.aisino.gulimall.thirdpart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ThirdPartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdPartApplication.class,args);
    }
}
