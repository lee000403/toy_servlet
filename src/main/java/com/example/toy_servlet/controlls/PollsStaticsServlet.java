package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.daos.PollsStaticsDao;

@WebServlet(urlPatterns = "/pollsStaticsServlet")
public class PollsStaticsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PollsStaticsDao pollsStaticsDao = new PollsStaticsDao();
            ArrayList pollsStaticsList = new ArrayList<>();
            String cnt_survey = pollsStaticsDao.cnt_Survey();
            pollsStaticsList = pollsStaticsDao.sum_Answer();

            request.setAttribute("cnt_survey", cnt_survey);
            request.setAttribute("pollsStaticsList", pollsStaticsList);

            String RESPONDENTS_ID = request.getParameter("RESPONDENTS_ID");
            String PASSWORD = request.getParameter("PASSWORD");

            request.setAttribute("RESPONDENTS_ID", RESPONDENTS_ID);
            request.setAttribute("PASSWORD", PASSWORD);

            response.setContentType("text/html;charset=UTF-8");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_statistic/statistic.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
