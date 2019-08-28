package com.wechat.reg.service.impl;

import com.wechat.reg.dao.FUserDAO;
import com.wechat.reg.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 17:38
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    FUserDAO fUserDAO;

    @Override
    public Map<String, Object> getOpenId(String code, String APPID, String APPSecret) {
        



        return null;
    }
}
