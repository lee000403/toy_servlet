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

    <div class="container bg-info p-0 row mx-auto">
        <div class="fs-4 py-3 d-flex justify-content-start col-6">
            <button type="submit" formaction="" class=" btn btn-info text-light">회원관리</button>
            <button type="submit" formaction="" class=" btn btn-info text-light">설문하기</button>
            <button type="submit" formaction="" class=" btn btn-info text-light">설문통계</button>
        </div>
        <div class="fs-4 py-3 d-flex justify-content-end col-6">
            <button type="submit" formaction="" class="btn btn-info text-light">로그인</button>
        </div>
    </div>
    <br>

    <!-- 위 게시판 부분 -->
    <div class="container">
        <h2 class="text-center">회원 상세정보</h2>
        <!--아이디 -->
        <form>
            <div class="form-group row  mb-3">
                <label for="id" class="col-sm-2 col-form-label">아이디</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="id" value="" readonly>
                </div>
            </div>
           <!-- 이름  -->
            <div class="form-group row  mb-3">
                <label for="name" class="col-sm-2 col-form-label">성명</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" value="" readonly>
                </div>
            </div>

            <!-- 패스워드    -->
            
            <div class="form-group row  mb-3">
                <label for="office" class="col-sm-2 col-form-label">비밀번호 </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="password" value="" readonly>
                </div>
            </div>
          
            
            
            <!-- 휴대폰   -->
            <div class="form-group row  mb-3">
                <label for="phone" class="col-sm-2 col-form-label">휴대폰</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="phone" value="" readonly>
                </div>
            </div>
           
                
            
            <div class="form-group row  mb-3">
                <div class="col-sm-10 offset-sm-2">
                    <div class="d-flex justify-content-end ">
                        <button type="button" class="btn btn-primary">수정</button>
                        <button type="button" class="btn btn-danger">삭제</button>
                        <button type="button" class="btn btn-secondary">닫기</button>
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