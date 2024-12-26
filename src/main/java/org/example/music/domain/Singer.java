package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import java.util.Date;

/**
* 歌手
* @TableName singer
*/
@Data
@ToString
public class Singer implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 性别（0女1男2组合3不明）
    */
    private Integer sex;
    /**
    * 头像
    */
    private String pic;
    /**
    * 生日
    */
    private Date birth;
    /**
    * 地区
    */
    private String location;
    /**
    * 简介
    */
    private String introduction;




}
