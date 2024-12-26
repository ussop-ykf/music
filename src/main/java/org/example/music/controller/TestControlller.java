package org.example.music.controller;

import org.example.music.domain.Admin;
import org.example.music.domain.Test;
import org.example.music.mapper.SingerMapper;
import org.example.music.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlller {
    @Autowired
    private TestService testService;
    @Autowired
    private SingerMapper singerMapper;
    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }
    @RequestMapping("/add")
    public String test2() {

        return testService.addName("你好");
    }

    @RequestMapping("/query")
    public Object querySinger() {
        return singerMapper.selectByPrimaryKey(5L);
    }
}
