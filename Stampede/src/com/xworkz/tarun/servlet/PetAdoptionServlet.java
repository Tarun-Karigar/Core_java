package com.xworkz.tarun.servlet;

import com.xworkz.tarun.dto.PetAdoptionDto;
import com.xworkz.tarun.service.PetAdoptionImpl;
import com.xworkz.tarun.service.PetAdoptionService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/petadoption")
public class PetAdoptionServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


.
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String phone = servletRequest.getParameter("phone");
        String message = servletRequest.getParameter("message");


        PetAdoptionDto dto = new PetAdoptionDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setPhone(phone);
        dto.setMessage(message);


        PetAdoptionService service = new PetAdoptionImpl();
        service.save(dto);

        servletResponse.getWriter().write("Enquiry Submitted Successfully!");
    }
}
