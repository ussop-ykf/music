package org.example.music.mapper;

import org.example.music.domain.Collect;

/**
* @author a1625
* @description 针对表【collect(收藏)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Collect
*/
public interface CollectMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

}
