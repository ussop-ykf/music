package org.example.music.service;

import org.example.music.domain.Singer;
import org.example.music.util.Result;

import java.util.List;

/**
 * @author 27542
 */
public interface SingerService {

    /**
    * 根据 id 查询歌手信息
    **/
    Singer querySingerById(Long id);

    List<Singer> querySingerList(Singer record, Integer pageNum, Integer pa);

    int addSinger(Singer singer);

}
