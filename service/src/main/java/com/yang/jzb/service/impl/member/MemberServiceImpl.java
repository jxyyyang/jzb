package com.yang.jzb.service.impl.member;

import com.yang.jzb.dao.member.MemberMapper;
import com.yang.jzb.model.member.Member;
import com.yang.jzb.service.face.member.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yang hituzi
 * @description 用户Service层
 * @date 2020年4月2日 17:19:52
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    MemberMapper memberMapper;

    @Override
    public int insertMember(Member member) {
        return memberMapper.insertMember(member);
    }
}
