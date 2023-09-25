package com.likelong.mall.member.feign;

import com.likelong.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
