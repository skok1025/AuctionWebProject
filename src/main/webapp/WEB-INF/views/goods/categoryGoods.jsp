<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    <!-- goods > index.jsp -->
    
<style>


#goodsList{
	width: 85%;
	min-height: 300px;
	margin: 20px auto;
	/* border: 1px solid black; */
}


#goodsList div{
	text-align: center;
	width: 30%;
	height: 350px;
	/* border: 1px solid red; */
	float:left;
	margin: 10px 15px;
}

#goodsList div:hover{
	border: 2px solid #ccc;
}

#goodsList img{
	width: 100%;
	height: 50%;
	margin-top: 20px;
}



</style>

<script>

	$(document).ready(function() {
		
		var category = document.getElementById("category");
		
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href='#'>"+category.value+"</a></li>");
		
		
		/* 관심상품 리모컨 고정 */
		$("#subBox").css({
			position:"fixed",
			left:document.body.clientWidth-400
		})
		
	});//ready

</script>
    
<div id="mycontents" style="float: left;">


<div id="pageTitle"><h1 class="page-header" style="font-size: 1em;">Products List</h1></div>

	<input type="hidden" value="${category}" id="category" name="category" />

	<div id="goodsList">
		<c:forEach items="${goodsList}" var="list">
			<div onclick="location.href='/spring/goods/goodsbuyer.action?seq=${list.seq}';" style="cursor: pointer;">
				<img src="/spring/resources/files/${list.mainimg}" alt="X" />
				<span><b>${list.goodname }</b></span><br><br>
				<span>현재 입찰가 : ${list.nowprice }원</span><br>
				<span>즉시 구매가 : ${list.instantprice}원</span><br>
				<span>경매 종료 : ${list.deadline}</span>
				<c:if test="${nowTime < list.deadline }">
					<span>경매 시각 : ${list.deadline} <i class="fas fa-door-open" style="color : cornflowerblue;"></i></span>
				</c:if>
				<c:if test="${nowTime > list.deadline }">
					<span>경매 종료됨 <i class="fas fa-door-closed" style="color: tomato"></i></span>
				</c:if>
			</div>
		</c:forEach>
	</div>
	



</div><!-- mycontents -->






