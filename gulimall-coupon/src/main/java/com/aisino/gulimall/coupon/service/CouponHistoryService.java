package com.aisino.gulimall.coupon.service;

import com.aisino.gulimall.common.util.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aisino.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wuxiang
 * @email 1325668250@gmail.com
 * @date 2022-06-21 14:35:01
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

