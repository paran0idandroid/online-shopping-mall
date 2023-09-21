package com.likelong.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likelong.mall.common.utils.PageUtils;
import com.likelong.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author jon
 * @email imjon2k@gmail.com
 * @date 2023-09-21 21:11:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

