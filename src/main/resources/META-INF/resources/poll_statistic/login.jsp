<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>로그인 화면</title>
</head>
<body>
  <form action="PollsSessionFilter" method="get">
      <div class="container">
        <div class="row justify-content-center mt-5">
          <div class="col-md-6">
            <div class="card">
              <div class="card-header">
                <h4>로그인 화면</h4>
              </div>
              <div class="card-body">
                <form>
                  <div class="form-group">
                    <label for="username">아이디</label>
                    <input type="text" class="form-control" name="RESPONDENTS_ID" id="username" placeholder="아이디 입력">
                  </div>
                  <div class="form-group">
                    <label for="password">비밀번호</label>
                    <input type="password" class="form-control" name="PASSWORD" id="password" placeholder="패스워드 입력">
                  </div>
                  <button type="submit" class="btn btn-primary">Sign In</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </body>
  </form>
</html>