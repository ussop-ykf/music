package org.example.music.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
* 管理员
* @TableName admin
*/
@Data
@ToString
public class Admin implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 账号
    */
    private String name;
    /**
    * 密码
    */
    private String password;


}
