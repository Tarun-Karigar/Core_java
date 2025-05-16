package com.xworkz.tarun.web;

import javax.naming.Name;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Donation" )
public class DonationServlet extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String s1=servletRequest.getParameter("Name");
        String s2=servletRequest.getParameter("Email");
        String s3=servletRequest.getParameter("Message");
//        servletResponse.setContentType("text/html");
//        PrintWriter result=servletResponse.getWriter();
//        result.println("Name is "+s1);
//        result.println("Message is  "+s3);
//        result.println("Email is"+s2);
        RequestDispatcher tar=servletRequest.getRequestDispatcher("DonationSuccess.jsp");
        servletRequest.setAttribute("Name","Success");

        tar.forward(servletRequest, servletResponse);

    }

}
