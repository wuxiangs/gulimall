package com.aisino.gulimall.order.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aisino.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 15:41:44
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

