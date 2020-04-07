package com.yang.jzb.model.member;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yang hituzi
 * @description 用户
 * @date 2020年4月2日 16:35:20
 */
@Data
@ApiModel(value = "用户信息表")
public class Member {

    @ApiModelProperty(value = "用户编号")
    String memberNo;

    @ApiModelProperty(value = "用户姓名")
    String memberName;

    @ApiModelProperty(value = "用户性别")
    String memberSex;

    @ApiModelProperty(value = "用户手机号")
    String memberPhone;
}
