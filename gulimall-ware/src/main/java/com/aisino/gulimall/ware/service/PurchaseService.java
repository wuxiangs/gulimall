package com.aisino.gulimall.ware.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aisino.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 16:11:55
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

