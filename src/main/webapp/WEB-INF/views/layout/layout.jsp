<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<style>

#addbtbox{
	width: 200px;
	height: 100px;
	border: 0px solid black;
	float: left;
	text-align: center;
	position: fixed;
	top: 240px;
	left:1500px;
	padding-top: 10px;
	border-radius: 5px;
	box-shadow: 1px 1px 10px #eee;
}
#subBox{
	width: 200px;
	height: 270px;
	border: 1px solid black;
	float: left;
	text-align: center;
	position: fixed;
	top: 350px;
	left:1500px;
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
<head>

<meta charset="UTF-8">
<title>Auction</title>
<tiles:insertAttribute name="asset"></tiles:insertAttribute>
<!-- Bootstrap core CSS-->
    <link href="/spring/resources/asset/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/spring/resources/asset/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">


    <!-- Page level plugin CSS-->
    <link href="/spring/resources/asset/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/spring/resources/asset/css/sb-admin.css" rel="stylesheet">

</head>


  <body id="page-top">
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
    <div id="wrapper">

      <tiles:insertAttribute name="goodssubmenu"></tiles:insertAttribute>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <tiles:insertAttribute name="bread"></tiles:insertAttribute>

<!-- ------------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------------ -->
          
          <tiles:insertAttribute name="core"></tiles:insertAttribute>

	<div id="addbtbox">
		<button class="btn btn-default teamblack" onclick="location.href='/spring/goods/addseller.action';"><i style="font-size: 1.5em;" class="fas fa-cart-plus"></i><br>상품등록 하러가기</button>

	</div>	

	<div id="subBox">
	

	
	<c:if test="${not empty email}">
		<small>${name}님의 관심상품</small>
		<hr>
		<c:forEach items="${interestList}" var="list">
			<div onclick="location.href='/spring/goods/goodsbuyer.action?seq=${list.seq}';">
				<img src="/spring/resources/files/${list.mainimg}" alt="X" /><br>
				<span><small>${list.goodname }</small></span>
			</div>
		</c:forEach>
		
		
	</c:if>
	
	<c:if test="${empty email}">
		<h4>로그인 해주세요.</h4>
	</c:if>
	</div>

<!-- ------------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------------ -->


        </div>
        <!-- /.container-fluid -->

        <tiles:insertAttribute name="footer"></tiles:insertAttribute>

      </div>
      <!-- /.content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <tiles:insertAttribute name="etc"></tiles:insertAttribute>

   
	

  </body>



</html>