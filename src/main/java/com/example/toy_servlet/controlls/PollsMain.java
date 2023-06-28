package com.example.toy_servlet.controlls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollsMain")
public class PollsMain extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls.jsp");
            requestDispatcher.forward(request, response);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
