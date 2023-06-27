package com.example.toy_servlet.filters;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.toy_servlet.daos.PollsLoginDao;

@WebServlet(urlPatterns = "/PollsSessionFilter")
public class PollsSessionFilter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_statistic/login.jsp");
            requestDispatcher.forward(request, response);
            PollsLoginDao pollsLoginDao = new PollsLoginDao();
            HashMap hashMap = pollsLoginDao.hash_id();

            String RESPONDENTS = request.getParameter("RESPONDENTS");
            String RESPONDENTS_ID = request.getParameter("RESPONDENTS_ID");
            String PASSWORD = request.getParameter("PASSWORD");

            HttpSession httpSession = request.getSession(false);
            String RESPONDENTS_ID_Session = (String) httpSession.getAttribute("RESPONDENTS_ID");

            if (httpSession != null && RESPONDENTS_ID_Session != null) {

            } else {
                if (hashMap.get(RESPONDENTS_ID).equals(PASSWORD)) {
                    httpSession = request.getSession();
                    httpSession.setAttribute("RESPONDENTS_ID", RESPONDENTS_ID);
                    httpSession.setAttribute("PASSWORD", PASSWORD);

                } else {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
