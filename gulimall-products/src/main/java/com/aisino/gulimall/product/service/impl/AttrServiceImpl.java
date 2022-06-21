package com.aisino.gulimall.product.service.impl;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.common.util.Query;
import com.aisino.gulimall.product.dao.AttrDao;
import com.aisino.gulimall.product.entity.AttrEntity;
import com.aisino.gulimall.product.service.AttrService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}