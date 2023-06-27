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

@WebServlet(urlPatterns = "/PollsManagementServlet")
public class PollsManagementServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("PollsManagementServlet - doGet()");

        try {
            String search = request.getParameter("search");
            PollsManagementDao pollsManagementDao = new PollsManagementDao();
            ArrayList<HashMap<String, String>> pollsManagementList = pollsManagementDao.selectWithSearch(search);

            // 검색 결과가 하나일 때만 선택
            if (pollsManagementList.size() > 0) {
                HashMap<String, String> result = pollsManagementList.get(0);
                request.setAttribute("search", search);
                request.setAttribute("pollsStaticsList", result);
            }

            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pollmanagement/information.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}