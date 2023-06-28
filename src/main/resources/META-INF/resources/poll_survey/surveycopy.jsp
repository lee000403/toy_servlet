<%@ page import="java.util.HashMap, java.util.ArrayList" %>
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
    <!-- top menu -->
    <%@ include file="/top_menus.jsp" %>
    <br>
    <% 
    String answer = (String)request.getAttribute("answer");
    %>
    <% ArrayList pollList = new ArrayList<>(); %>
    <% pollList = (ArrayList) request.getAttribute("pollList"); %>
    
    <form method="get" action="/surveyservlet"> 
    
    <div class="container mx-auto">
        <div>
        <p> 1. 이 수업에 대해 전반적으로 만족하십니까?</p>
        <label><input type="radio" name="Q-01" value="C-01"> 매우 그렇다 </label> <br>
        <label><input type="radio" name="Q-01" value="C-02"> 그렇다 </label><br>
        <label><input type="radio" name="Q-01" value="C-03"> 보통이다 </label><br>
        <label><input type="radio" name="Q-01" value="C-04"> 그렇지 않다 </label><br>
        </div>
        <br>
        <div>
            <p> 2. 강의계획서에 수업내용 및 목표와 평가방법이 자세하게 안내되었습니까?</p>
            <label><input type="radio" name="Q-02" value="C-01"> 매우 그렇다 </label> <br>
            <label><input type="radio" name="Q-02" value="C-02"> 그렇다 </label><br>
            <label><input type="radio" name="Q-02" value="C-03"> 보통이다 </label><br>
            <label><input type="radio" name="Q-02" value="C-04"> 그렇지 않다 </label><br>
        </div>
        <br>
        <div>
            <p> 3. 개강 초 수업에 대한 안내 혹은 오리엔테이션에 충실히 이루어졌습니까?</p>
            <label><input type="radio" name="Q-03" value="C-01"> 매우 그렇다 </label> <br>
            <label><input type="radio" name="Q-03" value="C-02"> 그렇다 </label><br>
            <label><input type="radio" name="Q-03" value="C-03"> 보통이다 </label><br>
            <label><input type="radio" name="Q-03" value="C-04"> 그렇지 않다 </label><br>
        </div>
        <br>
        <div>
            <p> 4. 대학원 학습 환경과 자료 제공은 만족스러웠나요?</p>
            <label><input type="radio" name="Q-04" value="C-01"> 매우 그렇다 </label> <br>
            <label><input type="radio" name="Q-04" value="C-02"> 그렇다 </label><br>
            <label><input type="radio" name="Q-04" value="C-03"> 보통이다 </label><br>
            <label><input type="radio" name="Q-04" value="C-04"> 그렇지 않다 </label><br>
        </div>
    </div>
        
    
</tbody>

    <div class="container bg-white fs-6 py-6 row mx-auto my-3">
        <div class="text-center d-flex justify-content-center py-2">
            <button type="submit" formaction="/poll_statistic/polls_login_main.jsp" class=" btn btn-white mx-2 btn-outline-dark">닫기</button>
            <button type="submit" formaction="/pollsStaticsServlet" class="btn btn-white btn-outline-dark bg-info">설문 제출</button>
        </div>
    </div>

    </form>
</body>
</html>