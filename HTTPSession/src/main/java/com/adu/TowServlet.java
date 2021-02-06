package com.adu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

public class TowServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.带哦用请求对象，向tomcat索要当前用户的私人储物柜
        HttpSession httpSession = request.getSession();
        //2.将session中的所有key读取出来，存放到每一个枚举对象中
        Enumeration goodNames = httpSession.getAttributeNames();
        while (goodNames.hasMoreElements()){
            String goodName = (String) goodNames.nextElement();
            int goodNum =  (int) httpSession.getAttribute(goodName);
            System.out.println("一共购买多少"+goodNum);
        }




    }
}
