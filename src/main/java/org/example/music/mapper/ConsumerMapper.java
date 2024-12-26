package org.example.music.mapper;

import org.example.music.domain.Consumer;

/**
* @author a1625
* @description 针对表【consumer(前端用户)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Consumer
*/
public interface ConsumerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);

}
