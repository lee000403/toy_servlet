<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>설문 통계</title>
</head>
<body>
    <form action="/pollsStaticsServlet">
        <div class="container p-0">
            <div class="bg-info py-3 fs-3 text-light text-center"> 설문 통계 </div>
            <div class="fs-4 py-3"> 총 설문자  : ?</div>
            <div class="fs-4 pb-3">각 문항 답항 개수 표시</div>
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>답항</th>
                        <th>개수</th>
                    </tr>
                </thead>
                <% ArrayList pollsStaticsList = new ArrayList<>(); %>
                <% int cnt_survey = request.getAttribute("cnt_survey");
                <% pollsStaticsList = (ArrayList) request.getAttribute("pollsStaticsList"); %>
                <tbody>
                    <% for (int i = 0; i < pollsStaticsList.size(); i++) { %>
                        <% HashMap pollsCnt = new HashMap<>(); 
                        pollsCnt = (HashMap) pollsStaticsList.get(i);
                        %>
                    <tr>
                        <td>
                            <%= pollsCnt.get("CHOICE"); %>
                        </td>
                        <td>
                            <%= pollsCnt.get("CNT"); %>
                        </td>
                    </tr>
                <% } %>
                </tbody>
            </table>
        </div>
    </form>
</body>
</html>