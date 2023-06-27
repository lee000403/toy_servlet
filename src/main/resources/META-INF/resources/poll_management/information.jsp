<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>



<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 상세정보</title>

    <!-- 부트스트랩 CSS 링크 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>

<body>
    <%
    ArrayList pollsManagementList = new ArrayList<>();
    pollsManagementList = (ArrayList) request.getAttribute("pollsStaticsList");
    int num = (int) request.getAttribute("number");
    HashMap hashMap = new HashMap<>();
    %>
    <!-- 위 게시판 부분 -->
    <div class="container">
        <h2 class="text-center">회원 상세정보</h2>
        <!--아이디 -->
        <form>
            <% for (int i = 0; i < pollsManagementList.size(); i++) { %>
                <% if (num == i + 1) { %>
                    <% hashMap = new HashMap<>(); %>
                    <% hashMap = (HashMap) pollsManagementList.get(i); %>
                
            <div class="form-group row  mb-3">
                <label for="id" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    아이디 <div class="form-control"><%= hashMap.get("RESPONDENTS_ID") %></div>
                </div>
            </div>
           <!-- 이름  -->
            <div class="form-group row  mb-3">
                <label for="name" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    이름 <div class="form-control"><%= hashMap.get("RESPONDENTS") %></div>
                </div>
            </div>

            <!-- 패스워드    -->
            
            <div class="form-group row  mb-3">
                <label for="office" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    비밀번호 <div class="form-control"><%= hashMap.get("PASSWORD") %></div>
                </div>
            </div>
          
            
            
            <!-- 휴대폰   -->
            <div class="form-group row  mb-3">
                <label for="phone" class="col-sm-2 col-form-label"></label>
                <div class="col-sm-10">
                    전화번호 <div class="form-control"><%= hashMap.get("PHONENUMBER") %></div>
                </div>
            </div>
            <% } %>
           <% } %>
                
            
            <div class="form-group row  mb-3">
                <div class="col-sm-10 offset-sm-2">
                    <div class="d-flex justify-content-end ">
                        <button type="submit" class="btn btn-secondary" formaction="/poll_management/management.jsp">닫기</button>
                    </div>
                </div>
            </div>
        </form>
    </div>


    <!-- 부트스트랩 및 필요한 JavaScript 파일 -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- 비밀번호 초기화 기능 -->
    <script>
        function resetPassword() {
            document.getElementById('password').value = '';
        }
    </script>
</body>

</html>