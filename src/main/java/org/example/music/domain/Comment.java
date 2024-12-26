package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import java.util.Date;

/**
* 评论
* @TableName comment
*/
@Data
@ToString
public class Comment implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 评论类型（0歌曲1歌单）
    */
    private Integer type;
    /**
    * 歌曲id
    */
    private Integer songId;
    /**
    * 歌单id
    */
    private Integer songListId;
    /**
    * 评论内容
    */
    private String content;
    /**
    * 收藏时间
    */
    private Date createTime;
    /**
    * 评论点赞数
    */
    private Integer up;

}
