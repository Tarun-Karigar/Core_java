import com.sun.glass.ui.Size;
import com.xwrkz.servlet.dto.Furnituredto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Furniture")
public class FurnitureServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String brand=req.getParameter("brand");
                String size=req.getParameter("size");
                String material=req.getParameter("material");
                String model_Name =req.getParameter("model_Name");
                String product_Benefits=req.getParameter("product_Benefits");
        Furnituredto furnitureDto = new Furnituredto();
        furnitureDto.setBrand(brand);
        furnitureDto.setMaterial(material);
        furnitureDto.setSize(size);
        furnitureDto.setModel(model_Name);
        furnitureDto.setBenefits(product_Benefits);

        req.setAttribute("FurnitureDto", furnitureDto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("FurnitureSuccess.jsp");
        dispatcher.forward(req,resp);

}

    }

