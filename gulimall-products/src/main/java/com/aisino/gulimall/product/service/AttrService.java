package com.aisino.gulimall.product.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 商品属性
 *
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 09:51:23
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

