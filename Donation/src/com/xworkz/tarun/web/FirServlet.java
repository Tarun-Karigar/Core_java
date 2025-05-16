package com.xworkz.tarun.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Service;
import java.io.IOException;

@WebServlet(urlPatterns = "/Fir")
public class FirServlet extends HttpServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String Full_Name=servletRequest.getParameter("Full_Name");
        String Contact_Number =servletRequest.getParameter("Contact_Number");
        String Email_Address = servletRequest.getParameter("Email_Address");
        String Date_of_Incident=servletRequest.getParameter("Date_of Incident");
        String Incident_Location=servletRequest.getParameter("Incident_Location");
        String Complaint_Details=servletRequest.getParameter("Complaint_Details");

        RequestDispatcher tar1=servletRequest.getRequestDispatcher("/FirSuccess.jsp");

        servletRequest.setAttribute("Full_Name","Tarun");
        servletRequest.setAttribute("Contact_Number","9972548514");
        servletRequest.setAttribute("Email_Address","tarun@gmail.com");
        servletRequest.setAttribute("Date_of_Incident","68/5/5555");

        tar1.forward(servletRequest, servletResponse);

    }


}
