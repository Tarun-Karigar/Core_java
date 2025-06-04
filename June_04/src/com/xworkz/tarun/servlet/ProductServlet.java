package com.xworkz.tarun.servlet;

import com.xworkz.tarun.dto.ProductDto;
import com.xworkz.tarun.service.ProductService;
import com.xworkz.tarun.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String productId = servletRequest.getParameter("productId");
        String productName = servletRequest.getParameter("productName");
        double price = Double.parseDouble(servletRequest.getParameter("price"));
        String category = servletRequest.getParameter("category");
        int quantity = Integer.parseInt(servletRequest.getParameter("quantity"));

        ProductDto productDto = new ProductDto();

        productDto.setProductId(productId);
        productDto.setProductName(productName);
        productDto.setPrice(price);
        productDto.setCategory(category);
        productDto.setQuantity(quantity);

        ProductService productService = new ProductServiceImpl();
        boolean save = productService.save(productDto); // service call

        if (save) {
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("ProductSuccess.jsp");

            servletRequest.setAttribute("message", "Product saved successfully!");
            servletRequest.setAttribute("ProductDTO", productDto);

            dispatcher.forward(servletRequest, servletResponse);
        } else {
            servletRequest.setAttribute("message", "Saving of product failed!");
            RequestDispatcher dispatcher =
                    servletRequest.getRequestDispatcher("Product.jsp");
            dispatcher.forward(servletRequest, servletResponse);
        }
    }
}
