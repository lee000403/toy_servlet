<%@ page import="java.util.HashMap, java.util.ArrayList" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
            <title>회원관리</title>

        </head>

        <body>
            <form action="">
                <div class="container">
                    <h2>회원관리</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>번호 </th>
                                <th>아이디 </th>
                                <th>성명</th>
                                <th>세부정보</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>R-04</td>
                                <td>김철수</td>
                                <td>
                                    <button formaction="/pollsManagementServlet" class="btn btn-primary" name="info"
                                        value="1">버튼</button>
                                </td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>R-03</td>
                                <td>신사임당</td>
                                <td>
                                    <button formaction="/pollsManagementServlet" class="btn btn-primary" name="info"
                                        value="2">버튼</button>

                                </td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>R-02</td>
                                <td>장길산</td>
                                <td>
                                    <button formaction="/pollsManagementServlet" class="btn btn-primary" name="info"
                                        value="3">버튼</button>

                                </td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>R-01</td>
                                <td>홍길동</td>
                                <td>
                                    <button formaction="/pollsManagementServlet" class="btn btn-primary" name="info"
                                        value="4">버튼</button>

                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="d-flex justify-content-end">
                        <button type="submit" formaction="/polls_LoginServlet" class="btn btn-primary">메인화면</button>
                    </div>
                </div>
            </form>
        </body>

        </html>