package org.example.music.controller;

import org.example.music.service.AdminService;
import org.example.music.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("system/admin")
public class AdminController {


    @Autowired
    private AdminService adminService;


    @RequestMapping("login")
    public Result checkAdminLogin(String name, String password) {
        if (adminService.queryAdminByName(name, password)) {
            return Result.success("登录成功", "1");
        } else {
            return Result.error("用户名或密码错误", "0");
        }
    }
}
