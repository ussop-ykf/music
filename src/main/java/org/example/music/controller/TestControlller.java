package org.example.music.controller;

import org.example.music.domain.Admin;
import org.example.music.domain.Singer;
import org.example.music.domain.Test;
import org.example.music.mapper.SingerMapper;
import org.example.music.service.SingerService;
import org.example.music.service.TestService;
import org.example.music.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlller {
    @Autowired
    private TestService testService;
    @Autowired
    private SingerService singerService;
    @Autowired
    private SingerMapper singerMapper;

    @RequestMapping("query")
    public Object query() {
        return singerMapper.selectByPrimaryKey(5L);
    }
    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }
    @RequestMapping("/add")
    public String test2() {

        return testService.addName("你好");
    }

    /**
     * 参数传递
     * @return
     */
    @RequestMapping("/querySinger")
    public Result querySinger(Long id) {
        Singer singer = singerService.querySingerById(id);
        if (singer == null) {
            return Result.error("查询失败");
        }
        return Result.success("歌手信息查询", singer);

    }
}
