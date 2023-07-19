<%--
  Created by IntelliJ IDEA.
  User: akdrh
  Date: 2023-07-19
  Time: 오전 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Event</title>
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn-delete-event").on('click', function() {
                location.href="delete?seq=" + ${dto.seq};
                alert("삭제가 완료되었습니다!");
            })
        });
    </script>
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

    <!--   본문    -->
    <!--   이벤트 신청    -->
    <div class="row my-5 justify-content-center">
        <div class="col-8" >
            <div class="row mb-3 border-bottom">
                <div class="col-12">
                    <img src="images/oy3.png" style="width: 100%">
                </div>
            </div>
            <div class="col-12 border-bottom pt-3 ps-2 mt-3">
                <h5>
                    <strong>이벤트 신청란</strong>
                </h5>
                <p class="me-3" style="font-size: xx-small; text-align: right;">
                    <strong><span>*</span>표시는 반드시 입력해야할 항목입니다.</strong>
                </p>
            </div>
            <form id="form" action="update" method="post" class="bg-light pb-3">
                <table class="table">
                    <tr>
                        <th><span>*</span> 이름</th>
                        <td>
                            <input type="text" name="name" id="name" value="${dto.name}"/>
                        </td>
                    </tr>
                    <tr>
                        <th><span>*</span> 성별</th>
                        <td>
                            <select name="gender" id="gender">
                                <option selected="selected" disabled="disabled">${dto.gender}</option>
                                <option value="W">여성</option>
                                <option value="M">남성</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th><span>*</span> 연령</th>
                        <td>
                            <select name="age" id="age">
                                <option selected="selected" disabled="disabled">${dto.age}대</option>
                                <option value="10">10대</option>
                                <option value="20">20대</option>
                                <option value="30">30대</option>
                                <option value="40">40대</option>
                                <option value="50">50대</option>
                                <option value="60">60대</option>
                                <option value="70">70대</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th><span>*</span> 휴대폰번호</th>
                        <td>
                            <input type="tel" name="tel" id="tel" value="${dto.tel}" readonly>
                        </td>
                    </tr>
                </table>
                <div class="row my-3">
                    <div class="col-12 text-center">
                        <button type="button" class="btn" id="btn-delete-event">삭제하기</button>
                        <button type="submit" style="background-color: #A6CD48" class="btn" id="btn-insert-event">수정하기</button>
                    </div>
                </div>
            </form><br><br>
        </div>
    </div>
</div>
</body>
</html>
