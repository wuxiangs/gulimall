package com.aisino.gulimall.product.dao;

import com.aisino.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 09:51:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
