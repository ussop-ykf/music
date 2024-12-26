package org.example.music.mapper;

import org.example.music.domain.Song;

/**
* @author a1625
* @description 针对表【song(歌曲)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Song
*/
public interface SongMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Song record);

    int insertSelective(Song record);

    Song selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);

}
