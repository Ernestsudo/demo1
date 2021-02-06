package com.adu.Dao;

import org.apache.catalina.User;

import java.sql.PreparedStatement;

public class UserDao {
    //实现User注册功能
    public int add(User user){


       String sql = "insert into user(username,password,sex,email) " + "values(?,?,?,?)";
        PreparedStatement preparedStatement =

    }




    //实现User查询功能




    //实现User删除功能


}
