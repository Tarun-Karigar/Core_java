package com.xworkz.tarun.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/Feedback")
public class FeedbackServlet extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String Teacher_Name = servletRequest.getParameter("Teacher's Name");
        String Your_Name=servletRequest.getParameter("Your Name");
        String Feedback_Comments = servletRequest.getParameter("Feedback Comments");
        RequestDispatcher tar=servletRequest.getRequestDispatcher("FeedbackSuccess.jsp");

        servletRequest.setAttribute("Teacher_Name","Om Sir");
        servletRequest.setAttribute("Your_Name","Tarun");
        servletRequest.setAttribute("Feedback_Comments","Very Good");

        tar.forward(servletRequest, servletResponse);

    }

}
