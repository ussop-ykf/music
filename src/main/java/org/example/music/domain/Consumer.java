package org.example.music.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import java.util.Date;

/**
* 前端用户
* @TableName consumer
*/
@Data
@ToString
public class Consumer implements Serializable {

    /**
    * 主键
    */
    private Integer id;
    /**
    * 账号
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 性别（1男0女）
    */
    private Integer sex;
    /**
    * 电话
    */
    private String phoneNum;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 生日
    */
    private Date birth;
    /**
    * 签名
    */
    private String introduction;
    /**
    * 地区
    */
    private String location;
    /**
    * 头像
    */
    private String avator;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


}
