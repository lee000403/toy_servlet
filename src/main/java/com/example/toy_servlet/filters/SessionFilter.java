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

@WebServlet(urlPatterns = "/sessionFilter")
public class SessionFilter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = ((HttpServletRequest) request).getSession();
            PollsLoginDao pollsLoginDao = new PollsLoginDao();
            HashMap hashMap = pollsLoginDao.hash_id();
            String RESPONDENTS_ID = request.getParameter("RESPONDENTS_ID");
            String PASSWORD = request.getParameter("PASSWORD");

            HttpSession httpSession = ((HttpServletRequest) request).getSession(false);
            String RESPONDENTS_ID_Session = (String) httpSession.getAttribute("RESPONDENTS_ID");

            if (httpSession != null && RESPONDENTS_ID_Session != null) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls_Logout");
                requestDispatcher.forward(request, response);
            } else {
                if (hashMap.containsKey(RESPONDENTS_ID) && hashMap.get(RESPONDENTS_ID).equals(PASSWORD)) {
                    httpSession = request.getSession();
                    httpSession.setAttribute("RESPONDENTS_ID", RESPONDENTS_ID);
                    httpSession.setAttribute("PASSWORD", PASSWORD);
                    RequestDispatcher requestDispatcher = request
                            .getRequestDispatcher("/poll_statistic/polls_login_main.jsp");
                    requestDispatcher.forward(request, response);

                } else {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_statistic/login.jsp");
                    requestDispatcher.forward(request, response);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
