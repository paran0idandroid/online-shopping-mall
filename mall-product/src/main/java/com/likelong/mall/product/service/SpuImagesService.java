package com.likelong.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likelong.mall.common.utils.PageUtils;
import com.likelong.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-18 21:39:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

