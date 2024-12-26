package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


/**
* 歌单包含歌曲列表
* @TableName list_song
*/
@Data
@ToString
public class ListSong implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 歌曲id
    */
    private Integer songId;
    /**
    * 歌单id
    */
    private Integer songListId;


}
