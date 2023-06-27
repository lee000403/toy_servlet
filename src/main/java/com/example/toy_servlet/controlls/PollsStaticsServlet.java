package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.daos.PollsStaticsDao;

@WebServlet(urlPatterns = "/pollsStaticsServlet")
public class PollsStaticsServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PollsStaticsDao pollsStaticsDao = new PollsStaticsDao();
            ArrayList pollsStaticsList = new ArrayList<>();
            int cnt_survey = pollsStaticsDao.cnt_Survey();
            pollsStaticsList = pollsStaticsDao.sum_Answer();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
