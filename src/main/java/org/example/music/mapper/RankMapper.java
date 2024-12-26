package org.example.music.mapper;

import org.example.music.domain.Rank;

/**
* @author a1625
* @description 针对表【rank(评价)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Rank
*/
public interface RankMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);

}
