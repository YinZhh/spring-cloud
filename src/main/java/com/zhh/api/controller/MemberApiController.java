package com.zhh.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: 会员服务控制层
 * @Description:
 * @Author: yin.zhh
 * @Date 2018-12-23 15:08
 * @Version v.1.0.0
 */
@RestController
public class MemberApiController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    public String getmember() {
        return "this is member，我是会员服务  端口号： " + serverPort;
    }
}
