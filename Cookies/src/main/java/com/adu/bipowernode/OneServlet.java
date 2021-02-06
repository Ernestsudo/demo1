package com.adu.bipowernode;

import javax.servlet.http.Cookie;
import java.io.IOException;

public class OneServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName,money;
        //1.调用  请求对象读取请求头
        userName = request.getParameter("userName");
        money = request.getParameter("money");
        //2.开卡
        Cookie cookie1 = new Cookie("userName",userName);
        Cookie cookie2 =new Cookie("money",money);
        //3.发卡 将cookie写入到相应头中
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        //4.通知cookie发送到浏览器中，让浏览器来处理该cookie
        request.getRequestDispatcher("/index_2.html").forward(request,response);



    }
}
