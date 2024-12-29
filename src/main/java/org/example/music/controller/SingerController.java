package org.example.music.controller;

import org.example.music.domain.Singer;
import org.example.music.service.SingerService;
import org.example.music.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 27542
 */
@RestController
@RequestMapping("system/singer")
public class SingerController {

    @Autowired
    private SingerService singerService;

    /**
     *
     * @param singer  前端传入的歌手信息与后端属性名相同
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("list")
    public Result querySingerList(Singer singer, @RequestParam(required = false, defaultValue = "1")Integer pageNum, @RequestParam(required = false, defaultValue = "5")Integer pageSize) {
        List<Singer> singerList = singerService.querySingerList(singer, pageNum, pageSize);
        return Result.success(singerList);
    }


    public Result addSinger(Singer singer) {
        return Result.success();
    }
    public Result updateSingerMsg(Singer singer){
        return Result.success();
    }
    public Result updateSingerPic(Singer singer){
        return Result.success();
    }
    public Result deleteSinger(Long id){
        return Result.success();
    }
    public Result querySingerList(Singer singer){
        return Result.success();
    }
    public Result querySingerOfName(String name){
        return Result.success();
    }
    public Result querySingerOfSex(){
        return Result.success();
    }

}
