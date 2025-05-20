package com.xworkz.tarun.servlet;

import com.xworkz.tarun.dto.Collegedto;
import com.xworkz.tarun.service.CollegeService;
import com.xworkz.tarun.service.CollegeServiceImpl;

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

        CollegeService collegeService=new CollegeServiceImpl();
        boolean save= collegeService.save(collegedto);//servie
        if(save) {
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("College_Admission_Success.jsp");
//add data to jsp
            servletRequest.setAttribute("message", "Save Success");
            servletRequest.setAttribute("Collegedto", collegedto);
            dispatcher.forward(servletRequest,servletResponse);
        }
        else{

            servletRequest.setAttribute("message", "Saving of College Failed");
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("College_Admission.jsp");
            dispatcher.forward(servletRequest,servletResponse);
        }


//
//        servletRequest.setAttribute("Collegedto","collegedto");
//        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("College_Admission_Success.jsp");
//        dispatcher.forward(servletRequest,servletResponse);

    }
}
