<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    <!-- goods > index.jsp -->
    
<style>



#searchList{
	/* border: 1px solid red; */
	text-align: center;
	min-height: 1000px;
	
}

#realGoodsBox{
	width: 85%;
	min-height: 300px;
	margin: 20px auto;
}

#goodsList div{
	
	width: 23%;
	height: 350px;
	border: 0px solid red;
	float:left;
	margin: 10px 8px;
}

#goodsList div:hover{
	border: 2px solid #ccc;
}

#goodsList img{
	width: 100%;
	height: 50%;
	margin-top: 20px;
}

#subBox{
	width: 200px;
	height: 270px;
	border: 1px solid black;
	float: left;
	text-align: center;
	position: fixed;
	top: 350px;
	padding-top: 10px;
	border-radius: 5px;
	box-shadow: 1px 1px 10px #eee;
}

#subBox div{
	width: 50%;
	height: 40%;
	/* border: 1px solid red; */
	float: left;
}

#subBox div:hover{
	 border: 5px solid #eee; 
}

#subBox img{
	width: 50%;
	height: 50%;
}

</style>

<script>

$(document).ready(function() {
	
	$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''/spring/goods/index.action'>검색</a></li>");
	
	
	/* 관심상품 리모컨 고정 */
	$("#subBox").css({
		position:"fixed",
		left:document.body.clientWidth-400
	})

	
});//ready

</script>
    
<div id="mycontents" style="float: left;">


<div id="pageTitle"><h1 class="page-header" style="font-size: 1em;">Search Product</h1></div>

	<div id="searchList">
		<h2>"${searchWord}"를 찾은 결과 입니다.</h2>
			
		 	<div id="goodsList">
			<c:forEach items="${searchGoodsList}" var="list">
				<div onclick="location.href='/spring/goods/goodsbuyer.action?seq=${list.seq}';">
					<img src="/spring/resources/files/${list.mainimg}" alt="X" />
					<span><b>${list.goodname }</b></span><br><br>
					<span>현재 입찰가 : ${list.nowprice }원</span><br>
					<span>즉시 구매가 : ${list.instantprice}원</span><br>
					<c:if test="${nowTime < list.deadline }">
						<span>경매 시각 : ${list.deadline} <i class="fas fa-door-open" style="color : cornflowerblue;"></i></span>
					</c:if>
					<c:if test="${nowTime > list.deadline }">
						<span>경매 종료됨 <i class="fas fa-door-closed" style="color: tomato"></i></span>
					</c:if>
				</div>
			</c:forEach>
		</div> 
		
	</div><!-- //searchBox -->

</div><!-- mycontents -->

	



