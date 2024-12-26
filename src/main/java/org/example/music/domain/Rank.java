package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
* 评价
* @author 27542
 * @TableName rank
*/
@Data
@ToString
public class Rank implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 歌单id
    */
    private Integer songListId;
    /**
    * 用户id
    */
    private Integer consumerId;
    /**
    * 评分
    */
    private Integer score;



}
