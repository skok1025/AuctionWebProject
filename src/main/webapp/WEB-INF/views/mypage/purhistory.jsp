<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
   
<script>
	$(document).ready(function(){
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href='#'>My Page</a></li>");
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''>구매 내역</a></li>");
	});
</script>  
    
<style>
	table {
		font-size : 17px;
		text-align : center;
		line-height: 3;
	}
	img{
		width :50px;
		height :50px;
	}
</style>   
<script>

</script>
<div id="mycontents">
<div id="pageTitle">
<h1 class="page-header" style="font-size: 1.5em;">구매 내역</h1>
</div>

<table class="table table-bordered">
	<tr>
		<th>날짜</th>
		<th>상품정보</th>
		<th>상품가격</th>
		<th>배송상태</th>
		<th>상품수령여부</th>
		<th>신고하기</th>
		<th>환불하기</th>
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td>${dto.payDate}</td>
		<td><img src="/spring/resources/files/${dto.imageName }">${dto.goodname}</td>
		<td>${dto.biddingPrice}</td>
		<td>
			<a href="https://tracker.delivery/#/kr.cjlogistics/${dto.shipnum }" target="_blank">배송조회</a>
		</td>
		<td>
			<c:if test="${dto.esStatus ==0 }">
				<button class="btn btn-default teamblack" >수령확인</button>
			</c:if>
			<c:if test="${dto.esStatus ==1 }">
				수령인증
			</c:if>
		</td>
		<td>
			<c:if test="${dto.rpStatus ==0 }">
				<button class="btn btn-default teamblack">신고하기</button>
			</c:if>
			<c:if test="${dto.rpStatus ==null }">
				<button class="btn btn-default teamblack">신고하기</button>
			</c:if>
			<c:if test="${dto.rpStatus ==1 }">
				<a href="#">신고내역</a>
			</c:if>
		</td>
		<td>
			<c:if test="${dto.rfStatus ==0 }">
				<button class="btn btn-default teamblack" onclick="location.href='/spring/refund/refundadd.action?seq=${dto.seq}';">환불하기</button>
			</c:if>
			<c:if test="${dto.rfStatus ==1 }">
				<a href="#">${dto.rfStatus}환불내역</a>
			</c:if>
			
		</td>
	</tr>
	</c:forEach>
</table>
</div>