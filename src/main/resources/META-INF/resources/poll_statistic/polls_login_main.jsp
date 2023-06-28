<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
        <title> 설문 조사 </title>
    </head>

    <body>
        <form action="">
            <div class="container bg-info p-0 row mx-auto">
                <div class="fs-4 py-3 d-flex justify-content-start col-6">
                    <button type="submit" formaction="/poll_management/management.jsp" class=" btn btn-info text-light">회원관리</button>
                    <button type="submit" formaction="/surveyservlet" class=" btn btn-info text-light">설문하기</button>
                    <button type="submit" formaction="/pollsStaticsServlet" class=" btn btn-info text-light">
                        <input type="hidden" name="RESPONDENTS_ID" value="<%= session.getAttribute("RESPONDENTS_ID")%>" >
                        <input type="hidden" name="PASSWORD" value="<%= session.getAttribute("PASSWORD") %>">
                        설문통계 
                    </button>
                </div>
                <div class="fs-4 py-3 d-flex justify-content-end col-6">
                    <button type="submit" formaction="/polls_Logout" class="btn btn-info text-light">(로그아웃, <%= session.getAttribute("RESPONDENTS_ID")%>)</button>
                </div>
            </div>
            <div class="container m-auto p-5">
                <img src="../pollimage.png" alt="이미지 로딩" width="100%" height="100%" class="m-auto">
                <div class="h-3 text-center">설문 조사 홈페이지</div>
            </div>
        </form>
    </body>

    </html>