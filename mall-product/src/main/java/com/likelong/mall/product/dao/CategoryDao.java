package com.likelong.mall.product.dao;

import com.likelong.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-18 21:39:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
