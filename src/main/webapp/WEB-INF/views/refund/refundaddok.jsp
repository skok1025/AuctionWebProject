<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<style>

</style>
<script>
	<c:if test="${result == 1}">
	location.href = "/spring/mypage/purhistory.action"; //글쓰기 성공
	</c:if>
	
	<c:if test="${result == 0}">
	alert('글쓰기 실패'); //글쓰기 실패
	history.back();
	</c:if>
</script>    
<div id="mycontents">
<div id="pageTitle"><h1 class="page-header" style="font-size: 1.5em;">Refund</h1></div>

</div>