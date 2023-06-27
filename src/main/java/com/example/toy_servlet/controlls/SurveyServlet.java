package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.example.toy_servlet.commons.Commons;
import com.example.toy_servlet.daos.PollSurveyDao;
import com.example.toy_servlet.daos.PollsStaticsDao;

@WebServlet(urlPatterns = "/surveyservlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String answer = request.getParameter("answer"); // 답항을 받는 것

            PollSurveyDao pollSurveyDao = new PollSurveyDao();
            ArrayList optionInforList = new ArrayList<>();
            optionInforList = pollSurveyDao.answersuvey(answer, null);

            //JSP로 넘겨줌
            request.setAttribute("answer", answer);
            request.setAttribute("optionInforList", optionInforList);

            // getWriter 전에 charset 하기 (한글 깨지지 않게끔)
               response.setContentType("text/html;charset=UTF-8");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
