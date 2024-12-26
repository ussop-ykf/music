package org.example.music.mapper;

import org.example.music.domain.Admin;

/**
* @author a1625
* @description 针对表【admin(管理员)】的数据库操作Mapper
* @createDate 2024-12-25 19:47:13
* @Entity org.example.music.domain.Admin
*/

public interface AdminMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}
