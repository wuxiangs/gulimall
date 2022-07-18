package com.aisino.gulimall.product.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.aisino.gulimall.product.entity.AttrEntity;
import com.aisino.gulimall.product.vo.AttrRespVo;
import com.aisino.gulimall.product.vo.AttrVo;
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


    void saveAttr(AttrVo attr);

    /**
     * 获取分类下的规格参数
     * @param params
     * @param catelogId
     * @param type
     * @return
     */
    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);


    AttrRespVo getAttrInfo(Long attrId);

    /**
     * 规格更新
     * @param attrVo
     */
    void updateById(AttrVo attrVo);
}

