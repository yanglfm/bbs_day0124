package com.tom.bbs_day0124.constants;

public enum ResultEnum {
    /**
     * 这儿相当于new 的对象的
     * 101:第一个1：代表成功，01:代表状态码
     * <p>
     * 1: 系统
     * 2：用户
     * 3：操作成功
     * 4：操作失败
     */

    INSERT_SUCCESS_MESS(30001, "添加成功"),
    INSERT_FAILED_MESS(40001, "添加失败"),
    UPDATE_SUCCESS_MESS(30002, "修改成功"),
    UPDATE_FAILED_MESS(40002, "修改失败"),
    REGISTER_SUCCESS(30003, "注册成功"),
    REGISTER_FAILED(40003, "注册失败"),
    UPLOAD_SUCCESS_MESS(30004, "上传成功"),
    UPLOAD_FAILED_MESS(40004, "上传失败"),
    LOGIN_SUCCESS_MESS(30005, "登录成功"),
    DELETE_SUCCESS_MESS(30006, "删除成功"),
    DELETE_FAILED_MESS(40006, "删除失败"),
    LOGIN_FAILED_MESS(40007, "用户名或密码不正确"),
    USER_IS_EXIST(40008, "用户名已存在"),
    USER_NOT_FOUND(40009, "用户名不存在"),

    SELECT_SUCCESS(0, "查询成功"),
    SELECT_FAILED(40010, "查询失败"),
    MAIL_SEND_SUCCESS(30011, "邮件发送成功"),
    MAIL_SEND_FAILED(40011, "邮件发送失败"),
    VERIFY_CODE_FAILED(40012, "验证码不正确"),
    REMOVE_SUCCESS(101, "移除成功"),
    PROCESS_SUCCESS(0, "操作成功"),
    PROCESS_FAILED(0, "操作失败"),
    NUM_OVERLARGE(1010, "数量超过限制,同一类型商品最多选购10件"),
    DATA_NOT_EXISTS(1000, "数据不存在"),
    DATA_IS_REPETITION(5000, "表单已过期，请刷新后尝试"),
    PASSWORD_NOT_CORRECT(500, "密码不正确"),
    MAIL_BIND_SUCCESS(0, "邮箱绑定成功"),
    MAIL_BIND_FAILED(500, "邮箱绑定失败"),
    SYSTEM_INNER_ERROR(500, "系统内部错误"),


    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
