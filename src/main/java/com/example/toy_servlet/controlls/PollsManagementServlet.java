package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.io.PrintWriter;
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
            PollsManagementDao pollsManagementDao = new PollsManagementDao();
            ArrayList<HashMap<String, String>> pollsManagementList = new ArrayList<>();
            String cnt_survey = pollsManagementDao.();
            pollsManagementList = pollsManagementDao.();

            request.setAttribute("cnt_survey", cnt_survey);
            request.setAttribute("pollsStaticsList", pollsManagementList);

            for (int i = 0; i < pollsManagementList.size(); i++) {
                HashMap<String, String> pollsCnt = new HashMap<>();
                pollsCnt = pollsManagementList.get(i);
                pollsCnt.get("CHOICE");
                pollsCnt.get("CNT");
            }

            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_management/management.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}