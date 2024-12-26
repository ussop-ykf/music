package org.example.music.mapper;

import org.example.music.domain.SongList;

/**
* @author a1625
* @description 针对表【song_list(歌单)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.SongList
*/
public interface SongListMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SongList record);

    int insertSelective(SongList record);

    SongList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SongList record);

    int updateByPrimaryKey(SongList record);

}
