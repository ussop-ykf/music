package org.example.music.mapper;

import org.example.music.domain.Comment;

/**
* @author a1625
* @description 针对表【comment(评论)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Comment
*/
public interface CommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

}
