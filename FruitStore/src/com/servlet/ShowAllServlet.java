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
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "ShowAllServlet", value = "/ShowAllServlet")
public class ShowAllServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService=new ProductServiceImpl();
        List<Product> list = new ArrayList<Product>();
        list=productService.showAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("showAll.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
