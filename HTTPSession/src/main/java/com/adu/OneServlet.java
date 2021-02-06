package com.adu;

import org.omg.CORBA.FREE_MEM;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String goodsName;

        //1.调用请求对象，读取请求对象头参数，得到用户选择商品名称
       goodsName = request.getParameter("goodsName");
       //2.获取session对象
        HttpSession httpSession = request.getSession();
        httpSession.getAttribute(goodsName);
        Integer goodsNUm = (Integer) httpSession.getAttribute(goodsName);
        if(goodsNUm == null){
            httpSession.setAttribute(goodsName,1);
        }else {
            httpSession.setAttribute(goodsName,goodsName+1);

        }
        request.getRequestDispatcher("/tow").forward(request,response);


    }
}
