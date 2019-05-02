<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<style>
	table {
		font-size : 17px;
		text-align : center;
		line-height: 3;
	}
</style>    
<div id="mycontents">
<div id="pageTitle">
	<h1 class="page-header" style="font-size: 1.5em;">Refund</h1>

	<form method="post" action="/spring/refund/refundaddok.action">
	<table class="table table-bordered">
		<tr>
			<th>환불 카테고리</th>
			<td>
				<select name="refundseq" class="form-control">
					<c:forEach items="${list }" var="cdto">
						<option value="${cdto.seq }">${cdto.category }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<th>환불내용</th>
			<td>
				<textarea name="detail" id ="detail" class="form-control"></textarea>
			</td>
		</tr>
	</table>
	<div id="btns" style="font-size:17px; float:right;" >
		<input type="submit" value="등록" class="btn btn-default">
		<input type="hidden" name="memberseq" id="memberseq" value="${memberseq }">
		<input type="hidden" name="auctionseq" id="auctionseq" value="${auctionseq }">
	</div>
	</form>

</div>
</div>