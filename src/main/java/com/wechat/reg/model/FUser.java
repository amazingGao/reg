package com.wechat.reg.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * f_user
 * @author 
 */
@Data
public class FUser implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 实名
     */
    private String realName;

    /**
     * 性别0 女 1 男
     */
    private Boolean sex;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    private String openid;

    private String unionid;
}