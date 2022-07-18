package com.aisino.gulimall.product.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //开启事务
@MapperScan("com.aisino.gulimall.product.dao")
public class MybatisConfig {

    /**
     * 引入分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
        //请求的页面大于最大页后操作,true返回带首页,false继续请求 默认false
        paginationInterceptor.setOverflow(true);
        paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
