package com.likelong.mall.member.dao;

import com.likelong.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-21 21:11:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
