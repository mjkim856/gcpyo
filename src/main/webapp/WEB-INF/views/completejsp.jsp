<%--
  Created by IntelliJ IDEA.
  User: akdrh
  Date: 2023-07-19
  Time: 오전 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>신청 완료</title>
</head>
<style>
    #search {
        border-color: darkgreen;
    }

</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<body>
    <div class="container">
        <!--  상단 내비바  -->
        <div class="row my-3 justify-content-center">
            <div style="text-align: right; font-size: 12px; padding-right: 150px; padding-bottom: 10px">
                <span>회원가입 | 로그인 | 장바구니 | 주문배송 | 고객센터 | 매장안내 | Global </span>
            </div>
            <div class="col-3">
                <img src="images/oy2.png" style="width: 300px">
            </div>
            <div class="col-3 mt-2"  style="text-align: center; line-height: 100px;">
                <div class="input-group" >
                    <input class="form-control border-success" type="text" id="search" name="keyword" placeholder="제품 검색 ex) 라이트닝 토너" />
                    <button class="btn btn-outline-success" type="submit">검색</button>
                    <div class="list-group position-absolute d-none border border-success rounded" id="keyword-list" style="z-index: 2000; left: 0; top: 40px; width: 80%; font-size: 0.8rem;"  ></div>
                    <div class="list-group position-absolute d-none border border-success rounded" id="remove-list" style="z-index: 2000; right: 0; top: 40px; width: 20%; font-size: 0.8rem;"  ></div>
                </div>
            </div>
            <div class="col-3" style="text-align: center; line-height: 50px;">
                <span>오늘 드림 | 관심 매장 소식 | 최근 본 상품 </span>
            </div>
        </div>
        <div class="row my-5 justify-content-center">
            <div class="col-8" style="text-align: center; background-color: snow; border-color: grey;">
                <br><br><br><br>
                <h1>${dto.name} 고객님!</h1>
                <h3>이벤트 신청이 완료되었습니다.</h3>
                <h5>신청해 주셔서 감사합니다. </h5>
                <h5>회원님의 신청 정보는 다음과 같습니다.</h5><br>
                <div>
                    <p>이름 : ${dto.name} <br>성별 : ${dto.gender} <br>나이 : ${dto.age} <br>전화번호 : ${dto.tel} </p>
                </div>
                <br>
                <button type="submit" style="background-color: darkgreen" class="btn">
                    <a href="/index"><span style="color: white;">HOME</span></a>
                </button>
                <button type="submit" style="background-color: darkgreen" class="btn">
                    <a href="/event"><span style="color: white;">EVENT</span></a>
                </button>
                <br><br><br><br>
            </div>
        </div>
    </div>
</body>
</html>
