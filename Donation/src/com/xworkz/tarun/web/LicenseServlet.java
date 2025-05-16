package com.xworkz.tarun.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/License")
public class LicenseServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String License_Number=req.getParameter("License Number");
        String License_Holders_Name=req.getParameter("License Holder's Name");
        String Issue_Date=req.getParameter("Issue Date");
        String Expiry_Date=req.getParameter("Expiry Date");

        RequestDispatcher tar= req.getRequestDispatcher("/LicenseSuccess.jsp");
        req.setAttribute("License_Number","854354");
        req.setAttribute("License_Holders_Name","Tarun");
        req.setAttribute("Issue_Date","12/12/2121");
        req.setAttribute("Expiry_Date","12/12/12");
        tar.forward(req,res);

    }
}
