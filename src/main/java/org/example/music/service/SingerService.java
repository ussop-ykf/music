package org.example.music.service;

import org.example.music.domain.Singer;

/**
 * @author 27542
 */
public interface SingerService {

    /**
    * 根据 id 查询歌手信息
    **/
    Singer querySingerById(Long id);
}
