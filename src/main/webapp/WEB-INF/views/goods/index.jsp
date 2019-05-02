<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    <!-- goods > index.jsp -->
    
<style>

#goodsBestBox{
	/* border: 1px solid red; */
	text-align: center;
	min-height: 1000px;
}

#categoryGoodsBest{
	width: 85%;
	height: 300px;
	/* border:1px solid blue; */
	margin: 0px auto;
	
}

#category button{
	margin-top: 10px;
	width: 100px;
	height: 30px;
	background-color: white;
	border-left: 1px solid #dfdfdf;
	border-right: 1px solid #dfdfdf;
	padding: 3px;
	box-shadow: 0px 0px 0px black;
}

#goodsBest{
	/* border: 1px solid yellow; */
	width: 95%;
	height: 250px;
	margin: 0px auto;
	margin-top: 10px;
}

#goodsBest div{
	margin-top:20px;
	width:19%;
	height:90%;
	float:left;
	border: 3px solid #eee;
	margin: 0px 4px;
}

#goodsBest div:hover{
	border: 9px solid #ccc;
}

#goodsBest img{
	width: 100%;
	height: 50%;
	margin-top: 20px;
}

#realGoodsBox{
	width: 85%;
	min-height: 300px;
	margin: 20px auto;
	
	/* border: 1px solid black; */
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
		
		
		
		
		/* 관심상품 리모컨 고정 */
		$("#subBox").css({
			position:"fixed",
			left:document.body.clientWidth-400
		})
		
		
		
		var realIndex = 5;
		
		$("#category button").click(function(){
			$("#category button").css("font-size","1em");
			$("#category button").css("font-weight","normal");
			$("#category button").css("border-bottom-color","white");
			
			$(this).css("font-size","1.1em");
			$(this).css("font-weight","bold");
			$(this).css("border-bottom-color","#cb3737");
			
			
			
			$.ajax({
				type:"get",
				url:"/spring/goods/categoryGoods.action",
				dateType:"json",
				data:"seq="+$(this).val(),
				success: function(result){
					
					$("#goodsBest").html("");
					
					console.log(result);
					
					$(result).each(function(index,item){
						
					var row ="";
					row+= "<div onclick="+"location.href='/spring/goods/goodsbuyer.action?seq="+item.seq+"';>";
					row+="<img src='/spring/resources/files/"+item.mainimg+"' alt='X' />";
					row+="<span style='margin-top: 30px; display: inline-block;'>"+item.goodname+"<br>현재 입찰가 : "+item.nowprice+"원</span>";
					row+= "</div>";
					
					$("#goodsBest").append(row);
					
					
					
					});//each
					
					
				},
				error: function(a,b,c){
					console.log(a+b+c);
				}
			});//ajax
			
			
		});//change
		
		
		
		$("#btnMore").click(function(){
			
			$.ajax({
				type : "get",
				url: "/spring/goods/realGoods.action",
				dataType : "json",
				success : function(result){
					console.log(result);
					 
					var nowTime = "${nowTime}";	
					
					for (var i = realIndex; i < realIndex + 4; i++) {
						
						var row="";
						row+= "<div onclick="+"location.href='/spring/goods/goodsbuyer.action?seq="+result[i].seq+"';>";
						row+="<img src='/spring/resources/files/"+result[i].mainimg+"' alt='X' />";
						row+="<span><b>"+result[i].goodname+"</b></span><br><br>";
						row+="<span>현재 입찰가 : "+result[i].nowprice+"원</span><br>";
						row+="<span>즉시 구매가 : "+result[i].instantprice+"원</span><br>";
						
						if (nowTime < result[i].deadline) {
							row+="<span>경매 시각 : "+result[i].deadline+"<i class='fas fa-door-open' style='color : cornflowerblue;'></i></span>"
						}
						else if(nowTime > result[i].deadline){
							row+="<span>경매 종료됨 <i class='fas fa-door-closed' style='color: tomato;'></i></span>"
						}
						
						
						row+="</div>";
						
						$("#goodsList").append(row);
						
					}//for
						realIndex += 4;
					
					
					
				},
				error : function(a,b,c){
					console.log(a+b+c);
				}
				
			});//ajax
			
			
		});//btnMore.click
		
	});//ready

</script>
    
<div id="mycontents" style="float: left;">


<div id="pageTitle"><h1 class="page-header" style="font-size: 1em;">Products List</h1></div>

	<div id="goodsBestBox">
		<h2>니쓸랭 베스트</h2>
		
		<div id="categoryGoodsBest">
			<div id="category" class="btn-group" role="group">
				<c:forEach items="${bigCategory}" var="bdto">
					<button type="button" class="btn btn-default" value="${bdto.seq}">${bdto.category}</button>
				</c:forEach>
			</div>
			
		<div id="goodsBest">
		</div>
			
		</div>
		
		<div id="realGoodsBox">
			<h2>니쓸랭 실시간</h2>
			
			<div id="goodsList">
			<c:forEach items="${realGoodsList}" var="list">
			<c:if test="${list.rownum<5}">
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
			</c:if> 
			</c:forEach>
				
			</div>
			
			<button type="button" id="btnMore" class="form-control" style="background-color: #eee;">더보기</button>
			
		</div>
		
		
	</div><!-- //goodsBestBox -->

</div><!-- mycontents -->

	



