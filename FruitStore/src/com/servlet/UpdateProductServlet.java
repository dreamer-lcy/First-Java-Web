package com.servlet;

import com.domain.Product;
import com.service.ProductService;
import com.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "UpdateProductServlet",value = "/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Integer id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        Double number=Double.parseDouble(request.getParameter("number"));
        String description=request.getParameter("description");
        Product product=new Product();

        product.setId(id);
        product.setName(name);
        product.setNumber(number);
        product.setDescription(description);

        ProductService productService=new ProductServiceImpl();
        int result=productService.updateProduct(product);
        if(result>0){
            request.getRequestDispatcher("ShowAllServlet").forward(request,response);
        }
        else {
            request.getRequestDispatcher("fail.jsp").forward(request,response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
