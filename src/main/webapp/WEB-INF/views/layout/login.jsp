<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
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
<style>

</style>
<script>

	$(document).ready(function() {
		
		
		
	});

</script>
</head>
<body class="bg-dark">

    <div class="container">
      <div class="card card-login mx-auto mt-5">
        <div class="card-header">Welcome your visit</div>
        <div class="card-body">
        
          <form method="post" action="/spring/account/loginok.action">
            <div class="form-group">
              <div class="form-label-group">
                <input type="email" id="inputEmail" name="id" class="form-control" placeholder="Email address" required="required" autofocus="autofocus" autocomplete="off">
                <label for="inputEmail">Email address</label>
              </div>
            </div>
            <div class="form-group">
              <div class="form-label-group">
                <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="required">
                <label for="inputPassword">Password</label>
              </div>
            </div>
            <div class="form-group">
              
            </div>
            <input type="submit" class="btn btn-primary btn-block"  value="Login"/>
          </form>
          
          <div class="text-center">
            <a class="d-block mt-3" href="register.html">Register an Account</a>
          </div>
        </div>
      </div>
    </div>

  </body>
</html>