package com.aisino.gulimall.product.service.impl;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.common.util.Query;
import com.aisino.gulimall.product.dao.BrandDao;
import com.aisino.gulimall.product.entity.BrandEntity;
import com.aisino.gulimall.product.service.BrandService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}