package com.wechat.reg.controller;

import com.wechat.constants.Result;
import com.wechat.reg.service.FUservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ghd
 * @Date: 2019/8/28 15:21
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @Autowired
    FUservice fUservice ;

    @RequestMapping("/getAA")
    @ResponseBody
    public String getAa(){
        return "aa";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Result getAll(){
        return Result.buildSuccessWithData(fUservice.queryAll());
    }

}
