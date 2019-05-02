<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://nsp.pay.naver.com/sdk/js/naverpay.min.js"></script>
<script>
	$(document).ready(function(){
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''/spring/goods/index.action'>winningBidPay</a></li>");
	});
</script>
<style>
.inputTitle {
	font-size: 2em;
}

.form-control {
	display: inline;
}

#goodsimgs {
	padding: 20px;
	width: 600px;
	height: 600px;
	border: 2px solid;
	float: left;
}

.tableTitle {
	text-align: center;
}
</style>


<div id="mycontents">
	<div id="pageTitle">
		<h1 class="page-header" style="font-size: 1.5em;">WinningBidPay</h1>
	</div>

	<form action="">

		<span class="inputTitle">나의 낙찰 확인하기</span>

		<div>
			<table id="goodslist" class="table-bordered" style="width: 1100px;">
				<tr>
					<th class="tableTitle" style="width: 600px;">응찰 상품</th>
					<th class="tableTitle">낙찰 여부</th>
					<th class="tableTitle">나의 응찰가</th>
					<th class="tableTitle">최종 낙찰가</th>
				</tr>
				<c:forEach items="${winning}" var="list">
					<tr>
						<td><img src="/spring/resources/files/${list.image}"
							style="width: 200px;"><span>[${list.goodname}]
								${list.detail}</span></td>
						<td style="text-align: center;">${list.status}</td>
						<td style="text-align: center;">${list.biddingprice}</td>
						<td style="text-align: center;">
							<div>${list.finalbiddingprice}</div> <c:if
								test="${list.status == '낙찰'}">
								<div>
									<input type="button" id="naverPayBtn" class="btn btn-warning"
										value="결제하기">
									<script>
										var oPay = Naver.Pay.create({
											"mode" : "production", // development or production
											"clientId" : "u86j4ripEt8LRfPGzQ8" // clientId
										});

										//직접 만드신 네이버페이 결제버튼에 click Event를 할당하세요
										var elNaverPayBtn = document
												.getElementById("naverPayBtn");

										elNaverPayBtn.addEventListener("click", function() {
												oPay.open({
													"merchantUserKey" : "2115",
													"merchantPayKey" : "11",
													"productName" : "${list.goodname}",
													"totalPayAmount" : "${list.biddingprice}",
													"taxScopeAmount" : "1000",
													"taxExScopeAmount" : "0",
													"returnUrl" : "/spring/goods/winningBidPay.action"
												});
										});
									</script>
								</div>
							</c:if>
						</td>

					</tr>
				</c:forEach>
			</table>
		</div>

	</form>
</div>