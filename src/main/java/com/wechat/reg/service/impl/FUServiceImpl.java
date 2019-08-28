package com.wechat.reg.service.impl;

import com.wechat.reg.dao.FUserDAO;
import com.wechat.reg.model.FUser;
import com.wechat.reg.service.FUservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 15:51
 */
@Service
public class FUServiceImpl implements FUservice {

    @Autowired
    FUserDAO fUserDAO;

    @Override
    public List<FUser> queryAll() {
        return fUserDAO.selectAll();
    }
}
