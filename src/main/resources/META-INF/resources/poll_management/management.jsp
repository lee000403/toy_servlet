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
    <form action="/pollsManagementsServlet">
        <% String cnt_survey = (String) request.getAttribute("cnt_survey"); %>
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
    <div class="container">
        <h2>회원관리</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>번호 </th>
                    <th>아이디 </th>
                    <th>성명</th>
                    <th>휴대폰 </th>
                    <th>가입일 </th>
                    <th>접속일 </th>
                    <th>개인정보 </th>
                    <th>작업</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>abcd1234@gmail.com</td>
                    <td>김철수</td>
                    <td>010-1111-2222</td>
                    <td>2017.03.01</td>
                    <td></td>
                    <td>비공개</td>
                    <td>
                        <button class="btn btn-primary">버튼</button>
                       
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>efgh1234@gmail.com</td>
                    <td>신사임당</td>
                    <td>010-2222-3333</td>
                    <td>2018.11.10</td>
                    <td></td>
                    <td>비공개</td>
                    <td>
                        <button class="btn btn-primary">버튼</button>
                       
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>hijk1234@gmail.com</td>
                    <td>장길산</td>
                    <td>010-3333-4444</td>
                    <td>2019.02.01</td>
                    <td></td>
                    <td>비공개</td>
                    <td>
                        <button class="btn btn-primary">버튼</button>
                       
                    </td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>lmno1234@gmail.com</td>
                    <td>홍길동</td>
                    <td>010-5555-6666</td>
                    <td>2020.03.01</td>
                    <td></td>
                    <td>비공개</td>
                    <td>
                        <button class="btn btn-primary">버튼</button>
                       
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
<!-- Code injected by live-server -->
<script>
	// <![CDATA[  <-- For SVG support
	if ('WebSocket' in window) {
		(function () {
			function refreshCSS() {
				var sheets = [].slice.call(document.getElementsByTagName("link"));
				var head = document.getElementsByTagName("head")[0];
				for (var i = 0; i < sheets.length; ++i) {
					var elem = sheets[i];
					var parent = elem.parentElement || head;
					parent.removeChild(elem);
					var rel = elem.rel;
					if (elem.href && typeof rel != "string" || rel.length == 0 || rel.toLowerCase() == "stylesheet") {
						var url = elem.href.replace(/(&|\?)_cacheOverride=\d+/, '');
						elem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());
					}
					parent.appendChild(elem);
				}
			}
			var protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
			var address = protocol + window.location.host + window.location.pathname + '/ws';
			var socket = new WebSocket(address);
			socket.onmessage = function (msg) {
				if (msg.data == 'reload') window.location.reload();
				else if (msg.data == 'refreshcss') refreshCSS();
			};
			if (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {
				console.log('Live reload enabled.');
				sessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);
			}
		})();
	}
	else {
		console.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');
	}
	// ]]>
</script>
</body>

</html>