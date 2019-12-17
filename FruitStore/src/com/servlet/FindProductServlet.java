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
@WebServlet(name = "FindProductServlet",value = ("/FindProductServlet"))
public class FindProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(request.getParameter("id"));
        ProductService productService=new ProductServiceImpl();
        Product product =productService.findProduct(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("updateProduct.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
