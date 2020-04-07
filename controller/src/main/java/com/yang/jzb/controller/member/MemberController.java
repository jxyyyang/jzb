package com.yang.jzb.controller.member;

import com.yang.jzb.common.enums.ErrorEnum;
import com.yang.jzb.model.member.Member;
import com.yang.jzb.service.face.member.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yang hituzi
 * @description 用户controller层
 * @date 2020年4月2日 17:23:28
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    MemberService memberService;

    @PostMapping("")
    public String insertMember(@RequestBody Member member){
        int count = memberService.insertMember(member);

        if(count == 1){
            return ErrorEnum.SUCCESS.getMsg();
        }

        return ErrorEnum.FAIL.getMsg();
    }
}
