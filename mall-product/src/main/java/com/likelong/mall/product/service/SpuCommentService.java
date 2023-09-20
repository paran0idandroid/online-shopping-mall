package com.likelong.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likelong.mall.common.utils.PageUtils;
import com.likelong.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-18 21:39:20
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

