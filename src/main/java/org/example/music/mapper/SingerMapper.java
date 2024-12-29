package org.example.music.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.music.domain.Singer;

import java.util.List;

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



    /**
     * 使用 @Parm 注解，sql 语句中 #{XXXX}， 强制改变参数名称
     * @param record
     * @param start
     * @param pageSize
     * @return
     */
    List<Singer> selectSingerList(@Param("record")Singer record, @Param("start") Integer start, @Param("pageSize")Integer pageSize);


}
