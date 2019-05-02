<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Sidebar -->
      <ul class="sidebar navbar-nav">
        
		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-glasses"></i>
            <span>패션/의류</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item " href="login.html">여성의류</a>
            <a class="dropdown-item" href="register.html">남성의류</a>
            <a class="dropdown-item" href="forgot-password.html">언더웨어</a>
          </div>
        </li>

		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-bong"></i>
            <span>뷰티/잡화</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">신발</a>
            <a class="dropdown-item" href="register.html">가방/패션잡화</a>
            <a class="dropdown-item" href="forgot-password.html">쥬얼리/시계/선글라스</a>
          </div>
        </li>

		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-baby"></i>
            <span>유아용품</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">기저귀/분유/유아식</a>
            <a class="dropdown-item" href="register.html">출산/유아용품/임부복</a>
            <a class="dropdown-item" href="forgot-password.html">장난감/교육완구/인형</a>
          </div>
        </li>

		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-couch"></i>
            <span>가구생활</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">가구/DIY</a>
            <a class="dropdown-item" href="register.html">조명/인테리어</a>
            <a class="dropdown-item" href="forgot-password.html">침구/커튼</a>
          </div>
        </li>
		
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="far fa-smile-beam"></i>
            <span>취미용품</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">건강/의료용품</a>
            <a class="dropdown-item" href="register.html">반려동물용품</a>
            <a class="dropdown-item" href="forgot-password.html">악기/취미/키덜트</a>
          </div>
        </li>

		
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-tv"></i>
            <span>디지털/가전</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=29">카메라</a>
            <a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=30">음향기기</a>
            <a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=31">게임</a>
			<a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=32">PC/노트북</a>
			<a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=33">PC주변기기</a>
			<a class="dropdown-item" href="/spring/goods/smallCategoryGoods.action?smallCategorySeq=34">휴대폰</a>
          </div>
        </li>
		
		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-futbol"></i>
            <span>스포츠/레저</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">휘트니스/수영</a>
            <a class="dropdown-item" href="register.html">스포츠의류/운동화</a>
            <a class="dropdown-item" href="forgot-password.html">골프용품</a>
          </div>
        </li>
		
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-car"></i>
            <span>자동차/공구</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">자동차용품/블랙박스</a>
            <a class="dropdown-item" href="register.html">오일/부품</a>
            <a class="dropdown-item" href="forgot-password.html">공구/안전/산업용품</a>
          </div>
        </li>

		<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-book-reader"></i>
            <span>도서</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
            <h6 class="dropdown-header">상품 소분류:</h6>
            <a class="dropdown-item" href="login.html">도서/교육/음반</a>
            <a class="dropdown-item" href="register.html">여행/항공권</a>
            <a class="dropdown-item" href="forgot-password.html">e쿠폰/모바일상품권</a>
          </div>
        </li>
	
		
		<div class="dropdown-divider"></div>


        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-address-card"></i>
            <span>마이페이지</span>
          </a>
          <div class="dropdown-menu" aria-labelledby="pagesDropdown">
          
            <c:if test="${empty email}">
            	<a class="dropdown-item" href="/spring/account/login.action">Login</a>
            </c:if>
            
            <c:if test="${not empty email}">
            	<a class="dropdown-item" href="/spring/account/logout.action">Logout</a>
            </c:if>
            	<a class="dropdown-item" href="/spring/goods/winningBidPay.action">WinningBidPay</a>
            
            	<a class="dropdown-item" href="register.html">Register</a>
            	<a class="dropdown-item" href="/spring/mypage/purhistory.action">My Page</a>
          </div>
        </li>
      </ul>
      
      
      