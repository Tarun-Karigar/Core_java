package com.xworkz.tarun.servlet;

import com.xworkz.tarun.dto.Clothdto;
import com.xworkz.tarun.service.ClothingService;
import com.xworkz.tarun.service.ClothingServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/cloth")
public class ClothServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name=servletRequest.getParameter("name");
        String type =servletRequest.getParameter("type");

        double incomingPrice = Double.parseDouble(servletRequest.getParameter("incomingPrice"));
        double sellingPrice = Double.parseDouble(servletRequest.getParameter("sellingPrice"));
        double mrp = Double.parseDouble(servletRequest.getParameter("mrp"));

        String description=servletRequest.getParameter("description");
        String brand=servletRequest.getParameter("brand");
        int quantity = Integer.parseInt(servletRequest.getParameter("quantity"));
        String color=servletRequest.getParameter("color");
        double weight = Double.parseDouble(servletRequest.getParameter("weight"));
        String manufDate=servletRequest.getParameter("manufDate");
        String warranty=servletRequest.getParameter("warranty");
        boolean returnPolicy = servletRequest.getParameter("returnPolicy") != null;

        Clothdto clothdto=new Clothdto();

        clothdto.setName(name);
        clothdto.setType(type);
        clothdto.setIncomingPrice(incomingPrice);
        clothdto.setSellingPrice(sellingPrice);
        clothdto.setMrp(mrp);
        clothdto.setDescription(description);
        clothdto.setBrand(brand);
        clothdto.setQuantity(quantity);
        clothdto.setColor(color);
        clothdto.setWeight(weight);
        clothdto.setManufDate(manufDate);
        clothdto.setWarranty(warranty);
        clothdto.setReturnPolicy( returnPolicy);
        ClothingService clothingService = new ClothingServiceImpl();
        boolean save = clothingService.save(clothdto); // service call

        if (save) {
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("ClothSuccess.jsp");

            servletRequest.setAttribute("message", "Clothing item saved successfully!");
            servletRequest.setAttribute("ClothingDTO", clothdto);

            dispatcher.forward(servletRequest, servletResponse);
        } else {
            servletRequest.setAttribute("message", "Saving of clothing item failed!");
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("Cloth.jsp");
            dispatcher.forward(servletRequest, servletResponse);
        }

    }
}
