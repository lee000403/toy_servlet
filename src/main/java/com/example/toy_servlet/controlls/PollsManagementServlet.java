package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.daos.PollsManagementDao;

@WebServlet(urlPatterns = "/pollsManagementServlet")
public class PollsManagementServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PollsManagementDao pollsManagementDao = new PollsManagementDao();
            ArrayList pollsManagementList = new ArrayList<>();
            pollsManagementList = pollsManagementDao.selectAll();
            int number = Integer.valueOf(request.getParameter("info"));
            request.setAttribute("number", number);
            request.setAttribute("pollsStaticsList", pollsManagementList);

  
            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_management/information.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}