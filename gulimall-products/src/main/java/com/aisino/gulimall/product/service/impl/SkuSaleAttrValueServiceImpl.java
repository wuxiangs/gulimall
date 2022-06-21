package com.aisino.gulimall.product.service.impl;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.common.util.Query;
import com.aisino.gulimall.product.dao.SkuSaleAttrValueDao;
import com.aisino.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.aisino.gulimall.product.service.SkuSaleAttrValueService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuSaleAttrValueEntity> page = this.page(
                new Query<SkuSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<SkuSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}