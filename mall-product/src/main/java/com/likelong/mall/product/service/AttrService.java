package com.likelong.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likelong.mall.common.utils.PageUtils;
import com.likelong.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-18 21:39:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

