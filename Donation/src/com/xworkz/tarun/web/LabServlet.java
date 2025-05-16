package com.xworkz.tarun.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/Labrotary")
public class LabServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String Laboratory_Name= req.getParameter("Laboratory_Name");
        String Laboratory_Location= req.getParameter("Laboratory_Location");
        String Contact_Person= req.getParameter("Contact Person");
        String Contact_Numbe= req.getParameter("Contact Numbe");

        RequestDispatcher tar=req.getRequestDispatcher("/LabSuccess.jsp");
        req.setAttribute("Laboratory_Name","Hytech_LAB");
        req.setAttribute("Laboratory_Location","Banglore");
        req.setAttribute("Contact_Person","Tarun");
        tar.forward(req,res);

    }
}
