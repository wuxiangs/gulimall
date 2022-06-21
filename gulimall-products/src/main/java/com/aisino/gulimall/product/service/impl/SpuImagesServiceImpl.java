package com.aisino.gulimall.product.service.impl;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.common.util.Query;
import com.aisino.gulimall.product.dao.SpuImagesDao;
import com.aisino.gulimall.product.entity.SpuImagesEntity;
import com.aisino.gulimall.product.service.SpuImagesService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}