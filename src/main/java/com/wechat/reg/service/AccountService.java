package com.wechat.reg.service;

import java.util.Map;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 17:38
 */
public interface AccountService {

    /**
     * 小程序获取openid
     * @param code
     * @param APPID
     * @param APPSecret
     * @return
     */
    Map<String,Object> getOpenId(String code,String APPID,String APPSecret);
}
