<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<style>
	#searchBox{
		width:130px;
		height: 30px;
		overflow: hidden; 
		background-color: white; 
		margin-top: 5px;
		margin-left: 30px; 
		padding:0px;
		border-radius: 5px;
		list-style-type: none; 
		padding: 4px;
		
		}
	</style>
	
	<script>
	
	$(function(){
		
	
		$("#searchBox").mouseover(function(){
			
			$("#searchBox").css("overflow","visible");
			$("#searchBox").css("height","250px"); 
			$("#searchBox").css("background-color","white"); 
			$("#searchBox").css("position","relative"); 
			$("#searchBox").css("top","110px"); 
			
		});//mouseover
		
		$("#searchBox").mouseout(function(){
			
			$("#searchBox").css("overflow","hidden");
			$("#searchBox").css("height","30px");
			$("#searchBox").css("top","0px"); 
			
		});//mouseout
		
		
	})//ready
	
	</script>
	
	
<nav class="navbar navbar-expand navbar-dark bg-dark static-top" style="height: 67px; overflow: visible;">

	<a class="navbar-brand mr-1" href="/spring/goods/index.action"><i
		class="fas fa-hand-holding-heart"></i> 너쓸랭</a>

	<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
		id="sidebarToggle" href="#">
		<i class="fas fa-bars"></i>
	</button>

	<!-- Navbar Search -->
	<form action="/spring/goods/searchGoods.action" method="get"
		class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
		<div class="input-group">
		<c:if test="${empty email}">
			<span style="color: white; text-align: center; margin-right: 30px;" >로그인 해주세요<br>니_쓸랭</span>
		</c:if>
		<c:if test="${not empty email}">
			<span style="color: white; text-align: center; margin-right: 30px;" >${name}(${email})<br>환영합니다.</span>
		</c:if>
		
			<input id="search" name="search" type="text" class="form-control" placeholder="Search for..."
				aria-label="Search" aria-describedby="basic-addon2" autocomplete="off" style="height: 48px;">
			<div class="input-group-append">
			
				<button class="btn btn-primary" type="button" id="btnSearch">
					<i class="fas fa-search"></i>
				</button>
				
			</div>
		</div>
		
	</form>
	
				<ul  id ="searchBox">
					<c:forEach items="${searchList}" var="list">
						<li style="padding:2px;"><a href="/spring/goods/searchGoods.action?search=${list.search}">${list.rownum}. ${list.search}</a></li>
					</c:forEach>
				</ul>

	<!-- Navbar -->
	<ul class="navbar-nav ml-auto ml-md-0">
		<li class="nav-item dropdown no-arrow mx-1"><a
			class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <span
				class="badge badge-danger">9+</span>
		</a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="alertsDropdown">
				<a class="dropdown-item" href="#">Action</a> <a
					class="dropdown-item" href="#">Another action</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Something else here</a>
			</div></li>
		<li class="nav-item dropdown no-arrow mx-1"><a
			class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i> <span
				class="badge badge-danger">7</span>
		</a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="messagesDropdown">
				<a class="dropdown-item" href="#">Action</a> <a
					class="dropdown-item" href="#">Another action</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="#">Something else here</a>
			</div></li>
		<li class="nav-item dropdown no-arrow"><a
			class="nav-link dropdown-toggle" href="#" id="userDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-user-circle fa-fw"></i>
		</a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="userDropdown">
				<a class="dropdown-item" href="#">Settings</a> <a
					class="dropdown-item" href="#">Activity Log</a>
				<div class="dropdown-divider"></div>
				<c:if test="${empty email}">
	            	<a class="dropdown-item" href="/spring/account/login.action">Login</a>
            	</c:if>
            
            	<c:if test="${not empty email}">
	            	<a class="dropdown-item" href="#">MyPage</a>
            	</c:if>
			</div></li>
	</ul>

</nav>







