<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">
	<c:if test="${result == 1}">
	alert("등록성공");
		location.href="/spring/goods/smssendseller.action?seq=${dto.seq}";
	</c:if>
	<c:if test="${result == 0}">
		alert("등록 실패");
		history.back();
	</c:if>
</script>