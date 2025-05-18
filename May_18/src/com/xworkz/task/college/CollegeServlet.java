package com.xworkz.task.college;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/College")
public class CollegeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String course=servletRequest.getParameter("course");
        String message=servletRequest.getParameter("message");
        Collegedto collegedto=new Collegedto();

        collegedto.setName(name);
        collegedto.setEmail(email);
        collegedto.setMessage(message);
        collegedto.setCourse(course);

        servletRequest.setAttribute("Collegedto","collegedto");
        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("College_Admission_Success.jsp");
        dispatcher.forward(servletRequest,servletResponse);

    }
}
