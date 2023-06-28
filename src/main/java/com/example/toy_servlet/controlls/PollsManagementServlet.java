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
            
             PollsManagementDao pollsManagementDao = new PollsManagementDao();  //dao 에서 회원관리 정보를 가져오는 작업 수행
            ArrayList pollsManagementList = new ArrayList<>(); // dao 데이터베이스에서 모든 회원 관리 정보를 조회하고, 그 결과를 pollsManagementList에 저장
            pollsManagementList = pollsManagementDao.selectAll();
            int number = Integer.valueOf(request.getParameter("info")); //클라이언트로부터 "info"라는 파라미터 값을 받아 정수로 변환 number 변수에 저장 
            request.setAttribute("number", number);
            request.setAttribute("pollsStaticsList", pollsManagementList); //request 객체에 ststic 변수이름으로  list값 저장 /jsp 페이지에서 해당값 사용 

  
            response.setContentType("text/html;charset=UTF-8"); //클라이언트에게 전송할 데이터 지정 
          // /poll_management/information.jsp"로 요청을 전달하기 위한 RequestDispatcher 객체를 생성
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll_management/information.jsp");
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}