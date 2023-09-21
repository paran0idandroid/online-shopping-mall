package com.likelong.mall.order.dao;

import com.likelong.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-21 21:34:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
