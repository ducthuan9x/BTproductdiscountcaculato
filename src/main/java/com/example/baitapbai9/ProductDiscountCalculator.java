package com.example.baitapbai9;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountCalculator", value = "/sayhello")
public class ProductDiscountCalculator extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String product =request.getParameter("sp");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount= Double.parseDouble(request.getParameter("discount"));
        double discountAmount=price*discount*0.01;
        double discountPrice =price-discountAmount;
        PrintWriter pw=response.getWriter();
        pw .println("<html>");
        if("tivi".equals(product)||"pashokon".equals(product)){
            pw.println("<h1> discount ="+discountAmount+"</h1>");
            pw.println("<h1 discountPrice=>"+discountPrice+"</h1>");
        }
        else {
            pw.println("<h1> not product </h1>");
        }
        pw.println("</html>");
    }
}

