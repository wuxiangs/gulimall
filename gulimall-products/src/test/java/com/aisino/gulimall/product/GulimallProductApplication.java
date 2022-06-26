package com.aisino.gulimall.product;


import com.aisino.gulimall.product.entity.BrandEntity;
import com.aisino.gulimall.product.service.BrandService;
import com.aliyun.oss.OSSClient;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplication {


    @Resource
    private BrandService brandService;

    @Resource
    private OSSClient ossClient;

    @Test
    public void contextLoads(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }


    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream=new FileInputStream("/Users/wuxiang/Pictures/1641965776252.jpg");
        ossClient.putObject("wuxiang520","1641965776252.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("上次成功");
    }
}
