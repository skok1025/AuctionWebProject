<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.data {
	text-align: center;
	font-size: 2em;
}

.mr-5 {
	font-size: 1.8em;
	height: 20px;
}

.numData {
	font-size: 2em;
}

.chart_sh {
	width: 600px;
	height: 400px;
	margin: 20px 60px;
	border: 1px solid #eee;
	float: left;
}

.card_sh {
	float: left;
	margin-top: 20px;
}

.fas {
	margin-right: 5px;
}

#pyo {
	width: 700px;
	height: 600px;
	border: 1px solid black;
	margin: 0 auto;
}

.middle_sh {
	vertical-align: middle;
	text-align: center;
}

.tx_left {
	text-align: left;
}

.tx_center {
	text-align: center;
}

.tx_right {
	text-align: right;
}

#container2:after {
	clear: both;
}

table th {
	background: #eee;
}

table td {
	text-align: center;
}
</style>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script>
	$(document).ready(
			function() {
				//경매 등록 추이
				Highcharts.chart('container', {

					chart : {
						type : 'column'
					},
					title : {
						text : '최근 7일 게시물 등록수'
					},
					data : {
						columns : [
								[ null, '2019-01-14', '2019-01-15',
										'2019-01-16', '2019-01-17',
										'2019-01-18', '2019-01-19',
										'2019-01-20' ], // categories
								[ '등록수', 24, 14, 27, 29, 43, 13, 25, 22 ] // first series		            
						]
					}
				});

				//회원가입 추이
				Highcharts.chart('container2', {

					chart : {
						type : 'column'
					},

					title : {
						text : '최근 7일 회원가입 수'
					},

					data : {
						columns : [
								[ null, '2019-01-14', '2019-01-15',
										'2019-01-16', '2019-01-17',
										'2019-01-18', '2019-01-19',
										'2019-01-20' ], // categories
								[ '회원수', 57, 75, 24, 37, 51, 64, 27 ] // first series
						/* ['2018-12-14', 15],
						['2018-12-15', 17],
						['2018-12-16', 12],
						['2018-12-17', 11],
						['2018-12-18', 14] */

						]
					}
				});

				// 신고/환불 추이
				Highcharts.chart('container3', {

					chart : {
						type : 'column'
					},

					title : {
						text : '최근 7일 게시물 등록수'
					},

					data : {
						columns : [
								[ null, '2019-01-14', '2019-01-15',
										'2019-01-16', '2019-01-17',
										'2019-01-18', '2019-01-19',
										'2019-01-20' ], // categories
								[ '등록수', 10, 20, 20, 14, 16, 26, 46, 64 ], // first series		            
						]
					}
				});

			});
</script>
<div id="mycontents" style="font-size: 0.8em; border: 0px;">
	<div id="pageTitle"></div>
	<!-- Icon Cards-->
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-primary o-hidden">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fas fa-fw fa-comments"></i>
					</div>
					<div class="mr-5">경매 완료</div>
				</div>
				<div class="data">
					<span class="numData">4,451</span>건
				</div>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-warning o-hidden">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fas fa-fw fa-list"></i>
					</div>
					<div class="mr-5">금일 등록 경매</div>
				</div>
				<div class="data">
					<span class="numData">27</span>건
				</div>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-success o-hidden">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fas fa-fw fa-shopping-cart"></i>
					</div>
					<div class="mr-5">회원수</div>
				</div>
				<div class="data">
					<span class="numData">54,842</span>건
				</div>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-danger o-hidden">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fas fa-fw fa-life-ring"></i>
					</div>
					<div class="mr-5">금일 가입자</div>
				</div>
				<div class="data">
					<span class="numData">124</span>건
				</div>
			</div>
		</div>
	</div>

	<!-- 차트 -->
	<div style="width: 780px;" class="card_sh">
		<div class="card mb-3">
			<div class="card-header">
				<i class="fas fa-chart-area" style="font-size: 2em;"></i><span
					style="font-size: 2em;">경매 등록 추이</span>
			</div>
			<div class="card-body">
				<div id="container" class="chart_sh"></div>
			</div>

		</div>
	</div>

	<div style="width: 780px; margin-left: 28px;" class="card_sh">
		<div class="card mb-3">
			<div class="card-header">
				<i class="fas fa-chart-area" style="font-size: 2em;"></i><span
					style="font-size: 2em;">회원가입 추이</span>
			</div>
			<div class="card-body">
				<div id="container2" class="chart_sh"></div>
			</div>
		</div>
	</div>
	<div style="clear: both;"></div>

	<div style="width: 780px;" class="card_sh">
		<div class="card mb-3">
			<div class="card-header">
				<i class="fas fa-chart-area" style="font-size: 2em;"></i><span
					style="font-size: 2em;">카테고리별 통계</span>
				<div style="width: 80%; display: inline;">
					<select id="categoryTitle" class="form-control"
						style="float: right; width: 150px;">
						<c:forEach items="${bigList}" var="category">
							<c:if test="${category == '디지털/가전'}">
								<option value="${category}" selected="selected">${category}</option>
							</c:if>
							<c:if test="${category != '디지털/가전' }">
								<option value="${category}">${category}</option>
							</c:if>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="card-body">
				<div id="container3" class="chart_sh"></div>
			</div>
		</div>
	</div>
	<div style="width: 780px; margin-left: 28px;" class="card_sh">
		<div class="card mb-3">
			<div class="card-header">
				<i class="fas fa-bullhorn" style="font-size: 2em;"></i><span
					style="font-size: 2em;">신고/환불 통계</span>

			</div>
			<div class="card-body"></div>

		</div>
	</div>

	<!-- Button trigger modal -->
	<!-- <button type="button" class="btn btn-primary btn-lg"
		data-toggle="modal" data-target="#myModal">모달아 떠랏</button> -->

	<!-- Modal -->

	<div class="modal fade bs-example-modal-lg" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" style="background: #212529;">
					<h4 style="color: white; margin: 0 auto;">입찰표</h4>
				</div>
				
				

				<div class="modal-body">
					<c:if test="${not empty bdto}">
						<table class="table table-bordered">
							<tr>
								<th colspan="3" style="width: 100px; text-align: center;">경매번호</th>
								<td class="tx_right" colspan="3"><span
									style="margin-right: 20px;">${bdto.seq}</span> 호</td>
							</tr>
							<tr>
								<th rowspan="6"
									style="text-align: center; vertical-align: middle;">입찰자</th>
								<th rowspan="3"
									style="width: 100px; text-align: center; vertical-align: middle;">본인</th>
								<th style="width: 100px;" class="tx_center">성명</th>
								<td colspan="3">${bdto.buyerName}</td>
							</tr>
							<tr>
								<th class="tx_center">사용자번호</th>
								<td>${bdto.buyerSeq}</td>
								<th class="tx_center">전화번호</th>
								<td>${bdto.buyerTel}</td>
							</tr>
							<tr>
								<th class="tx_center">주소</th>
								<td colspan="3">${bdto.buyerAddress}</td>
							</tr>
							<tr>
								<th rowspan="3"
									style="width: 100px; text-align: center; vertical-align: middle;">대리인</th>
								<th class="tx_center">성명</th>
								<td>${bdto.sellerName}</td>
								<th>본인과의 관계</th>
								<td>남남</td>
							</tr>
							<tr>
								<th class="tx_center" style="width: 100px;">사용자번호</th>
								<td>${bdto.sellerSeq}</td>
								<th style="width: 110px;" class="tx_center">전화번호</th>
								<td>${bdto.sellerTel}</td>
							</tr>
							<tr>
								<th class="tx_center">주소</th>
								<td colspan="3">${bdto.sellerAddress }</td>
							</tr>
							<tr>
								<th style="vertical-align: middle; text-align: center;">낙찰가율</th>
								<td colspan="2"
									style="vertical-align: middle; text-align: center;">89 %</td>
								<th style="vertical-align: middle; text-align: center;">낙찰가격</th>
								<td colspan="2"
									style="font-size: 2em; text-align: right; font-weight: bold;">${bdto.price}원</td>
							</tr>
						</table>
					</c:if>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">결제하기</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
</div>