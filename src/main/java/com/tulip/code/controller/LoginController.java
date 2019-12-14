package com.tulip.code.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 杨帆
 * @Date: 2019/12/12 00:01
 * @Description:
 */
@RestController
@RequestMapping("/")
@Api(tags = {"登录模块"})
public class LoginController {
    @ApiOperation(value = "用户登录", notes = "用户通过账号密码进行登录操作")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "account", value = "用户账号", required = true, paramType = "query", dataType = "string"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, paramType = "query", dataType = "string", defaultValue = "mm123")
    })
    @PostMapping("/login")
    public String login(String account, String password) {
        return account;
    }
}
