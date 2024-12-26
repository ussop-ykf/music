package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import java.util.Date;

/**
* 歌曲
* @TableName song
*/
@Data
@ToString
public class Song implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 歌手id
    */
    private Integer singerId;
    /**
    * 革命
    */
    private String name;
    /**
    * 简介
    */
    private String introduction;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 歌曲图片
    */
    private String pic;
    /**
    * 歌词
    */
    private String lyric;
    /**
    * 歌曲地址
    */
    private String url;


}
