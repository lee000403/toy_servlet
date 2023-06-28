package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.toy_servlet.daos.PollsLoginDao;

@WebServlet(urlPatterns = "/sessionCreateServlet")
public class SessionCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = ((HttpServletRequest) request).getSession();
            PollsLoginDao pollsLoginDao = new PollsLoginDao();
            HashMap hashMap = pollsLoginDao.hash_id();
            request.setAttribute("hashMap", hashMap);

            request.setCharacterEncoding("UTF-8");
            String RESPONDENTS_ID = request.getParameter("RESPONDENTS_ID");
            String PASSWORD = request.getParameter("PASSWORD");
            HttpSession httpSession = request.getSession(false); // 클라이언트의 상태값에 따라서 있으면 쓰고, 없으면 만들고 / 비교하고 넘겨주는 인스턴스화
            String uernameSession = (String) httpSession.getAttribute("username");
            if (httpSession != null && uernameSession != null) { // JSESSION 있음 (null이 아니면) -> 로그인이 되었다는 표시

            } else { // JSESSION 없음 (null이면) -> 로그인 해야된다는 소리
                if (hashMap.containsKey(RESPONDENTS_ID) && hashMap.get(RESPONDENTS_ID).equals(PASSWORD)) {
                    httpSession = request.getSession();
                    httpSession.setAttribute("RESPONDENTS_ID", RESPONDENTS_ID);
                    httpSession.setAttribute("RESPONDENTS_ID", RESPONDENTS_ID);
                } else {
                    
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
