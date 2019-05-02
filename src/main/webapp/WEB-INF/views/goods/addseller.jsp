<%@page import="java.time.Year"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="/spring/resources/asset/css/jquery-ui.css" rel="stylesheet">

<link rel="stylesheet"
	href="//mugifly.github.io/jquery-simple-datetimepicker/jquery.simple-dtpicker.css">

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script
	src="//mugifly.github.io/jquery-simple-datetimepicker/jquery.simple-dtpicker.js"></script>
<script src="/spring/resources/asset/js/jquery-ui.js"></script>

<script>



	$(function() {	
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''/spring/goods/addseller.action'>Goods Add</a></li>");
		
		$("#bigcategory").change(function(){
			
			$.ajax({
				type:"get",
				url:"/spring/goods/getsmallcategory.action",
				data:"bseq="+$("#bigcategory").val(),
				dataType:"json",
				success : function(result){
					console.log(result);
					$("#smallcategory").html("");
					$(result).each(function(index,item){
						var op = "<option value='"+item.seq+"'>"+item.category+"</option>";
						$("#smallcategory").append(op);
					});
				},
				error: function(a,b,c){
					console.log(a+b+c);
				}
			});
		});
		
		
		$("#addimgbtn").on("change",handleImgFileSelect);
		$("#addsubimgbtn1").on("change",handleImgFileSelect1);
		$("#addsubimgbtn2").on("change",handleImgFileSelect2);
		$("#addsubimgbtn3").on("change",handleImgFileSelect3);
		
		/* $('#deadline').datetimepicker(); */
		 $('#deadline').appendDtpicker({
			 'locale':'ko',
			 'minDate':'<%=Calendar.getInstance().get(Calendar.YEAR)%>/<%=Calendar.getInstance().get(Calendar.MONTH) + 1%>/<%=Calendar.getInstance().get(Calendar.DATE)%> <%=Calendar.getInstance().get(Calendar.HOUR)%>:<%=Calendar.getInstance().get(Calendar.MINUTE)%>'
						});

		$("#startprice").val("1000");
		$("#instantprice").val("100000");

		$("#slider-range").slider({
			range : true,
			min : 0,
			max : 1000000,
			step : 1000,
			values : [ 1000, 100000 ],
			slide : function(event, ui) {
				$("#startprice").val(ui.values[0]);
				$("#instantprice").val(ui.values[1]);
			}
		});

	});
	
	
	
	
	
	
	
	
	
	function handleImgFileSelect(e){
	      var files = e.target.files;
	      var fileArr = Array.prototype.slice.call(files);
	      
	      fileArr.forEach(function(f){
	         if(!f.type.match("image.*")){
	            alert("확장자는 이미지 확장자만 가능합니다.");
	            return;
	         }
	         
	         sel_file = f;
	         
	         var reader = new FileReader();
	         reader.onload = function(e){
	            $("#mainImg").attr("src",e.target.result);
	         }
	         reader.readAsDataURL(f);
	      });
	}
	
	function handleImgFileSelect1(e){
	      var files = e.target.files;
	      var fileArr = Array.prototype.slice.call(files);
	      
	      fileArr.forEach(function(f){
	         if(!f.type.match("image.*")){
	            alert("확장자는 이미지 확장자만 가능합니다.");
	            return;
	         }
	         
	         sel_file = f;
	         
	         var reader = new FileReader();
	         reader.onload = function(e){
	            $("#subImg1").attr("src",e.target.result);
	         }
	         reader.readAsDataURL(f);
	      });
	   }
	
	function handleImgFileSelect2(e){
	      var files = e.target.files;
	      var fileArr = Array.prototype.slice.call(files);
	      
	      fileArr.forEach(function(f){
	         if(!f.type.match("image.*")){
	            alert("확장자는 이미지 확장자만 가능합니다.");
	            return;
	         }
	         
	         sel_file = f;
	         
	         var reader = new FileReader();
	         reader.onload = function(e){
	            $("#subImg2").attr("src",e.target.result);
	         }
	         reader.readAsDataURL(f);
	      });
	   }
	
	function handleImgFileSelect3(e){
	      var files = e.target.files;
	      var fileArr = Array.prototype.slice.call(files);
	      
	      fileArr.forEach(function(f){
	         if(!f.type.match("image.*")){
	            alert("확장자는 이미지 확장자만 가능합니다.");
	            return;
	         }
	         
	         sel_file = f;
	         
	         var reader = new FileReader();
	         reader.onload = function(e){
	            $("#subImg3").attr("src",e.target.result);
	         }
	         reader.readAsDataURL(f);
	      });
	   }
</script>


<style>
select{
	font-size: .9em;
}

option{
	font-size: .7em;
}
.inputsize {
	width: 250px;
}

.inputTitle {
	font-size: 2em;
}

.form-control {
	display: inline;
}

#topbox {
	margin-top: 20px;
	height: 700px;
}

#goodsimgs {
	padding: 20px;
	width: 600px;
	height: 700px;
	border: 0px solid;
	float: left;
}

#addbox {
	width: 530px;
	height: 600px;
	border: 0px solid;
	float: left;
}

#bottombox {
	width: 1130px;
	height: 500px;
	border: 0px solid;
}

#mainImg {
	width: 550px;
	height: 380px;
}

.subimg {
	width: 159px;
	height: 110px;
}

#smallcategorybox {
	width: 150px;
	height: 200px;
	border: 1px solid;
	float: right;
}

#categoryBox {
	border: 1px solid red;
	height: 200px;
}

.lineinput {
	margin-bottom: 20px;
}

#addimgbtn {
	margin: 0px auto;
}

.imgbox {
	width: 550px;
	height: 380px;
	position: absolute;
	border: 0px solid;
}

.imgbox>img {
	z-index: -1;
	position: absolute;
}

.imgbox>label {
	z-index: 0;
	position: absolute;
	bottom: 0px;
}

#goodssubImgs {
	margin-top: 400px;
	height: 145px;
	width: 550px;
	border: 0px solid;
}

.subimgbox{
	float:left;
	width: 159px;
	height: 112px;
	position: relative;
	border: 0px solid red;
	margin: 10px;
}
.subimgbox>img {
	z-index: -1;
	position: absolute;
}
.subimgbox > label{
	z-index: 0;
	position: absolute;
	bottom: 0px;
}

input[type="file"]{
	display: none;
}

label { display: inline-block; padding: .5em .75em; color: #999; font-size: inherit; line-height: normal; vertical-align: middle; background-color: #fdfdfd; cursor: pointer; border: 1px solid #ebebeb; border-bottom-color: #e2e2e2; border-radius: .25em; }

</style>
<div id="mycontents">
	<div id="pageTitle">
		<h1 class="page-header" style="font-size: 1.5em;">Goods Add</h1>
	</div>

	<form action="/spring/goods/addsellerok.action" method="post" enctype="multipart/form-data">

		<span class="inputTitle">상품게시글 제목: </span><input type="text"
			name="title" id="title" placeholder="제목을 입력하세요."
			style="width: 500px;" class="form-control" />

		<div id="topbox">
			<div id="goodsimgs">
				<div class="imgbox">
					<img id="mainImg" 
						src="/spring/resources/images/seok/mainnoimage.png" />
					<label for="addimgbtn" class="teamblack"><i class="fas fa-upload" style="font-size: 2em; margin-left: 33px;"></i> <br /> 사진
						추가하기</label>
					<input type="file" id="addimgbtn" name="mainattach">
						
					
				</div>

				<div id="goodssubImgs">
					<div class="subimgbox">
						<img id="subImg1" class="subimg"
							src="/spring/resources/images/seok/noimage.jpg" /> 
						<input type="file" id="addsubimgbtn1" name="subattach1">
						<label class="teamblack" for="addsubimgbtn1"><i class="fas fa-upload" style="font-size: 1em;"></i></label>
						
					</div>
					<div class="subimgbox">
						<img id="subImg2" class="subimg"
							src="/spring/resources/images/seok/noimage.jpg" /> 
						<input type="file" id="addsubimgbtn2" name="subattach2">
						<label class="teamblack" for="addsubimgbtn2"><i class="fas fa-upload" style="font-size: 1em;"></i></label>
						
					</div>
					<div class="subimgbox">
						<img id="subImg3" class="subimg"
							src="/spring/resources/images/seok/noimage.jpg" /> 
						<input type="file" id="addsubimgbtn3" name="subattach3">
						<label class="teamblack" for="addsubimgbtn3"><i class="fas fa-upload" style="font-size: 1em;"></i></label>
						
					</div>
					
					
					

				</div>


			</div>

			<div style="padding: 20px;" id="addbox"
				class="shadow-lg p-3 mb-5 bg-white rounded">
				<div class="lineinput">
					<span class="inputTitle">- 경매종료시간 :</span> <input type="text"
						class="form-control inputsize" id='deadline' name="deadline" />
				</div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 상품명 :</span> <input
						style="margin-left: 75px;" type="text"
						class="form-control inputsize" id="goodname" name="goodname">
				</div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 브랜드명 :</span> <input
						style="margin-left: 50px;" type="text"
						class="form-control inputsize" id="brand" name="brand">
				</div>
				<div style="clear: both;"></div>

				<div id="categoryBox lineinput" style="margin-bottom: 20px;">
					<span class="inputTitle">- 상품분류 :</span> <select name="bigcategory"
						id="bigcategory" class="form-control" style="width: 150px;">
						<c:forEach items="${blist}" var="dto">
							<option value="${dto.seq}">${dto.category }</option>
						</c:forEach>
						
					</select> >
					<select name="smallcategoryseq" id="smallcategory" class="form-control" style="width: 150px;">
						<c:forEach items="${smallbasicList}" var="smalldto">
							<option value="${smalldto.seq}">${smalldto.category}</option>
						</c:forEach>
					</select>
				
				</div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 시작입찰가 :</span><input id="startprice"
						name="startprice" type="number" class="form-control inputsize">원
				</div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 즉시구매가 :</span><input id="instantprice"
						name="instantprice" type="number" class="form-control inputsize">원
				</div>
				<div style="clear: both;"></div>

				<div id="slider-range"
					style="margin-top: 20px; width: 400px; margin: 10px auto;"></div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 기본호가 :</span><input id="askingprice"
						name="askingprice" type="number" class="form-control inputsize">원
				</div>
				<div style="clear: both;"></div>
				<div class="lineinput">
					<span class="inputTitle">- 판매예상가 :</span><input id="estimatedprice"
						name="estimatedprice" type="number" class="form-control inputsize">원
				</div>
			</div>
		</div>

		<div id="bottombox">
			<span style="font-size: 3em; padding: 30px;">상품의 상세정보 </span>
			<textarea style="padding: 20px; font-size: 1.2em;" cols="30"
				rows="10" class="form-control" id="detail" name="detail"></textarea>
		</div>

		<div style="width: 1130px; text-align: center;">
			<input type="submit" class="btn btn-default teamblack" value="상품등록" />
		</div>

	</form>
</div>
