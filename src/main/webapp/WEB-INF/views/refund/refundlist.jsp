<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 
     
<script>
	$(document).ready(function(){
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href='#'>My Page</a></li>");
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''>환불 내역</a></li>");
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

<h1 class="page-header" style="font-size: 1.5em;">환불 내역</h1>

<table class="table table-bordered">
	<tr>
		<th>날짜</th>
		<th>상품명</th>
		<th>환불내용</th>
		<th>환불신청회원(이름)</th>
	</tr>
	<c:forEach items="${list }" var="dto">
	<tr>
		<td>${dto.regdate}</td>
		<td>${dto.goodname}</td>
		<td>${dto.detail}</td>
		<td>${dto.email}(${dto.name })</td>
	</tr>
	</c:forEach>
</table>


</div>

</div>