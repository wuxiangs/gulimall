package com.aisino.gulimall.member.feign;


import com.aisino.gulimall.common.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 会员的所有优惠卷
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
