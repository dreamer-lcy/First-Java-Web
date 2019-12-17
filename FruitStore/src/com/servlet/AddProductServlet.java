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


@WebServlet(name = "AddProductServlet",value="/AddProductServlet")
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        Double price=Double.parseDouble(request.getParameter("price"));
        Double number=Double.parseDouble(request.getParameter("number"));
        String description=request.getParameter("description");
        Product product=new Product(name,price,number,description);
        ProductService productService=new ProductServiceImpl();
        int result=productService.addProduct(product);
        if (result>0){
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
