package com.yang.jzb.dao.member;

import com.yang.jzb.model.member.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    /**
     *
     * 新增用户
     * @param member
     * @return int
     * @author yang hituzi
     * @date 17:16 2020/4/2
     */
    int insertMember(@Param("member")Member member);
}
