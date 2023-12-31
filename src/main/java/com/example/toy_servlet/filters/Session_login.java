package com.example.toy_servlet.filters;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.toy_servlet.daos.PollsLoginDao;

@WebFilter(urlPatterns = "/*")
public class Session_login implements Filter {
    public void init(){

    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            PollsLoginDao pollsLoginDao = new PollsLoginDao();
            HashMap hashMap = pollsLoginDao.hash_id();
            String RESPONDENTS_ID = request.getParameter("RESPONDENTS_ID");
            String PASSWORD = request.getParameter("PASSWORD");
            
            HttpSession httpSession = ((HttpServletRequest) request).getSession(false);
            String RESPONDENTS_ID_Session = "";
            if (httpSession == null) {
                RESPONDENTS_ID_Session = null;
            } else {
                RESPONDENTS_ID_Session = (String) httpSession.getAttribute("RESPONDENTS_ID");
            }

            if (httpSession != null && RESPONDENTS_ID_Session != null) {
                chain.doFilter(request, response);
            } else {
                if (hashMap.containsKey(RESPONDENTS_ID) && hashMap.get(RESPONDENTS_ID).equals(PASSWORD)) {
                    chain.doFilter(request, response);
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
