package com.aisino.gulimall.product.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 09:51:23
 */
public interface CategoryService extends IService<CategoryEntity> {


    PageUtils queryPage(Map<String, Object> params);


    /**
     * 查询出商品所有分类及其子分类，并以树形结构展示
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     * 删除
     * @param asList
     */
    void removeMenuByIds(List<Long> asList);
}

