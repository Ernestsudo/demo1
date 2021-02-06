package com.adu.bipowernode;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TowServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int jiaozi_money = 30;
        int miantiao_money = 20;
        int mifan_money = 15;
        String food;
        int xiaofei = 0;
        String userName = null;
        Integer money = null;
        Cookie cookieArray[] = null;
        Cookie cookie1 = null;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        food = request.getParameter("food");
        cookieArray = request.getCookies();
        int balance = 0;
        for (Cookie cookie : cookieArray) {
            String key = cookie.getName();
            String value = cookie.getValue();
            if ("userName".equals(key)) {
                userName = value;
            } else if ("money".equals(key)) {
                money = Integer.valueOf(value);
                if ("饺子".equals(food)) {
                    if (jiaozi_money > money) {
                        out.print("用户" + userName + "余额不足，请充值");
                    } else {
                        cookie1 = new Cookie("userName", (money - jiaozi_money) + "");
                        xiaofei = jiaozi_money;
                        balance = money - jiaozi_money;
                    }
                } else if ("面条".equals(food)) {
                    if (miantiao_money > money) {
                        out.print("用户" + userName + "余额不足，请充值");
                    } else {
                        cookie1 = new Cookie("userName", (money - miantiao_money) + "");
                        xiaofei = miantiao_money;
                        balance = money - miantiao_money;
                    }

                } else if ("米饭".equals(food)) {
                    if (miantiao_money > money) {
                        out.print("用户" + userName + "余额不足，请充值");
                    } else {
                        cookie1 = new Cookie("userName", (money - mifan_money) + "");
                        xiaofei = mifan_money;
                        balance = money - miantiao_money;
                    }
                }
            }

            response.addCookie(cookie1);
            out.println("用户" + userName + "本次消费" + xiaofei + "余额" + balance);
        }

    }  //1.读取请求头中的参数信息

}

