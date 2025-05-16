package com.tarun.xworkz.task;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Task1",loadOnStartup = 1)
public class Task1 extends GenericServlet {
    public Task1(){
        System.out.println("The task1 is Running....");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The sevice is Running...");
    }
    
}
