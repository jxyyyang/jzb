package com.yang.jzb.common.enums;/**
 * @author yang hituzi
 * @description 异常枚举
 * @date 2020年4月2日 17:26:37
 */
public enum ErrorEnum {

    SUCCESS(10000L,"操作成功"),
    FAIL(99999L,"操作失败");

    long code;
    String msg;

    ErrorEnum(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}