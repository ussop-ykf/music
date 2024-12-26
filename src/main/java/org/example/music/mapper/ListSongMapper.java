package org.example.music.mapper;

import org.example.music.domain.ListSong;

/**
* @author a1625
* @description 针对表【list_song(歌单包含歌曲列表)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.ListSong
*/
public interface ListSongMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ListSong record);

    int insertSelective(ListSong record);

    ListSong selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ListSong record);

    int updateByPrimaryKey(ListSong record);

}
