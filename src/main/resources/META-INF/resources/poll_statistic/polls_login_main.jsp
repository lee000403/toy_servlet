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
                <button type="submit" formaction="" class=" btn btn-info text-light">회원관리</button>
                <button type="submit" formaction="" class=" btn btn-info text-light">설문하기</button>
                <button type="submit" formaction="/pollsStaticsServlet" class=" btn btn-info text-light">설문통계</button>
            </div>
            <div class="fs-4 py-3 d-flex justify-content-end col-6">
                <button type="submit" formaction="/polls.jsp" class="btn btn-info text-light">로그아웃</button>
            </div>
        </div>
    </form>
</body>
</html>