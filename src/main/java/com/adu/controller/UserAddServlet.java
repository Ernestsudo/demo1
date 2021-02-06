package com.adu.controller;

import com.adu.Dao.UserDao;

import java.io.IOException;

public class UserAddServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username,password,sex,email;
        UserDao userDao = new UserDao();
        username = request.getParameter("username");
        password = request.getParameter("password");
        sex = request.getParameter("sex" );
        email = request.getParameter("email");

        //1.[调用请求对象]读取【请求头】参数信息，得到用户提交信息



        //2.【调用UserDao】将用户的信息填充到INSERT命令当中，并且借助JDBC规范发送到数据库上

        //3.【调用相应的对象】将【处理的结果】以二进制形式写入到响应体当中

    }

    //Tomcat负责销毁【请求对象】和相应对象
    //tomcat负责将http相应协议包发送到请求的浏览器上
    //
}
