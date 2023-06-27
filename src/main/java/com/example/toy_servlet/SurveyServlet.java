package com.example.toy_servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.example.toy_servlet.commons.Commons;
import com.example.toy_servlet.daos.PollsStaticsDao;

@WebServlet(urlPatterns = "/surveyservlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // try {
        //     String answer = request.getParameter("answer"); // 답항을 받는 것
        //     PollsStaticsDao pollsStaticsDao = new PollsStaticsDao();
        //     ArrayList optionInforList = new ArrayList<>();
        //     pollList = PollsStaticsDao.
        //     // html 받아오는것
        //     String temp = "";

        //     // DB에서 terminal로 데이터 가져오는 코드
        //     Commons commons = new Commons();
        //     Statement statement = commons.getStatement();
        //     String query = "";
        //     ResultSet resultSet = statement.executeQuery(query);

        //     // 웹에 html 방식으로 띄어주는 것
        //     String contents = "";
        //     PollsStaticsDao pollsStaticsDao = new PollsStaticsDao();
        //     ArrayList 
        //     pollList = pollsStaticsDao.Sel
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
