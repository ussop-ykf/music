package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


/**
* 歌单
* @TableName song_list
*/
@Data
@ToString
public class SongList implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 歌单图片
    */
    private String pic;
    /**
    * 简介
    */
    private String introduction;
    /**
    * 风格
    */
    private String style;



}
