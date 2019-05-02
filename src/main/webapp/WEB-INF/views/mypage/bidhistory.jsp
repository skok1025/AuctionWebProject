<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<script>
	$(document).ready(function(){
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href='#'>My Page</a></li>");
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''>응찰 내역</a></li>");
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
<div id="mycontents">
<div id="pageTitle">

<h1 class="page-header" style="font-size: 1.5em;">응찰 내역</h1>

<table class="table table-bordered">
	<tr>
		<th>응찰정보</th>
		<th>낙찰여부</th>
		<th>나의 응찰가</th>
		<th>최종 낙찰가</th>
		<th>결제하기</th>
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td><img src="/spring/resources/files/${dto.imageName }"> ${dto.title }</td>
		<td>${dto.status }</td>
		<td>${dto.biddingPrice }</td>
		<td>${dto.bigPrice }</td>
		<td>
			<c:if test="${dto.status=='낙찰' }">
				<button class="btn btn-default">결제하기</button>
			</c:if>
			<c:if test="${dto.status!='낙찰' }">
				결제불가
			</c:if>
		</td>
	</tr>
	</c:forEach>
</table>


</div>

</div>