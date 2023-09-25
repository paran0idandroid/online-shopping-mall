package com.likelong.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用Nacos进行配置管理
 * 引入nacos-config依赖
 * 引入bootstrap依赖以便高版本springboot能读取bootstrap文件
 * 在配置中心添加一个数据集（Data Id）
 * 在配置中心中添加任何配置
 * 结合@RefreshScope @Value动态获取配置文件中的值
 * 配置中心配置优先级高于本地配置文件
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
