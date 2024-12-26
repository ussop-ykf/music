package org.example.music.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.music.domain.Singer;

/**
* @author a1625
* @description 针对表【singer(歌手)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Singer
*/
public interface SingerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

}
