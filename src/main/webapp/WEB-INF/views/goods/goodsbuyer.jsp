<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- You can use Open Graph tags to customize link previews.
    Learn more: https://developers.facebook.com/docs/sharing/webmasters -->
<meta property="fb:admins" content="1007902866069581" />
<meta property="og:url"
	content="http://211.63.89.49:8090/spring/goods/goodsbuyer.action" />
<meta property="og:type" content="article" />
<meta property="og:title" content="${dto.title }" />
<meta property="og:description" content="Your description" />
<meta property="og:image"
	content="http://211.63.89.49:8090/spring/resources/files/${mainimg}" />


<link rel="stylesheet" href="/spring/resources/asset/css/flipclock.css" />
<script src="/spring/resources/asset/js/flipclock.js"></script>
<script src="/spring/resources/asset/js/highcharts.js"></script>
<script src="/spring/resources/asset/js/series-label.js"></script>
<script src="/spring/resources/asset/js/exporting.js"></script>
<script src="/spring/resources/asset/js/export-data.js"></script>

<script>

  function sharenaver() {
    var url = encodeURI(encodeURIComponent("http://211.63.89.49:8090/spring/goods/goodsbuyer.action"));
    var title = encodeURI("${dto.goodname}(${dto.brand})상품/ 현재입찰가: ${dto.nowprice}원");
    var shareURL = "https://share.naver.com/web/shareView.nhn?url=" + url + "&title=" + title;
    document.location = shareURL;
  }


	
	
	$(document).ready(function(){
		$(".breadcrumb").append("<li class='breadcrumb-item'><a href=''/spring/goods/index.action'>Buy Goods</a></li>");
		
		$("#directpricebt").click(function(){
			if(confirm('응찰하시겠습니까?'))
				location.href= '/spring/goods/bidupdate.action?auctionseq=${dto.seq}&mebidprice='+$("#directprice").val();
		});
		
		$("#heartbtn").click(function(){
			if($("#heartbtn").css("color")=="rgb(128, 128, 128)"){
				if(confirm("'${dto.goodname}'을 관심상품 등록하시겠어요?")){
					$.ajax({
						type:"get",
						url:"/spring/goods/addheart.action",
						data:"auctionseq="+${dto.seq}+"&memberseq=${memberseq}", // memberseq 수정요망
						success:function(result){
							console.log(result);
							if(result==1){ // 등록 성공
								
								$("#heartbtn").css({
									"color":"tomato"
								});
							}
						},
						error:function(a,b,c){
							console.log(a+b+c);
						}
					});
				}
			} else{
				if(confirm("'${dto.goodname}'을 관심상품 삭제하시겠어요?")){
					$.ajax({
						type:"get",
						url:"/spring/goods/delheart.action",
						data:"auctionseq="+${dto.seq}+"&memberseq=${memberseq}", // memberseq 수정요망
						success:function(result){
							console.log(result);
							if(result==1){ // 삭제 성공
								
								$("#heartbtn").css({
									"color":"gray"
								});
							}
						},
						error:function(a,b,c){
							console.log(a+b+c);
						}
					});
				}
			}
			
			
		});
	});
	
	
</script>



<style>
#filpclockbox {
	width: 500px;
	height: 80px;
	border: 0px solid;
}

select {
	font-size: .9em;
}

option {
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
	height: 700px;
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

#categoryBox {
	border: 0px solid red;
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

#goodssubImgs {
	margin-top: 400px;
	height: 145px;
	width: 550px;
	border: 0px solid;
}

.subimgbox {
	float: left;
	width: 159px;
	height: 112px;
	position: relative;
	border: 0px solid red;
	margin: 10px;
}

#btns>button {
	margin: 5px 15px 5px 10px;
}

.clock {
	zoom: 0.5;
	-moz-transform: scale(0.5)
}

#sharebox{
	margin-left: 400px;
}

#sharebox, #heartbox {
	width: 90px;
	height: 70px;
	border: 0px solid;
	float: left;
}

#heartbox{
	width: 350px;
	border: 0px solid;
}

#mybidbox{
	width: 250px;
	height: 80px;
	border: 0px solid;
	float: left;
	margin-left: 20px;
}

#mybidbox > div{
	float: left;
}

#possiblebox{
	width: 60px;
	height: 60px;
	border: 0px solid green;
	float: left;
	margin-left: 20px;
}

#possiblebox > i{
	font-size: 3.5em;
}

#heartbtn {
	cursor: pointer;
	padding-left: 10px;
	font-size: 2.5em;
	float: left;
}

#naverbtn {
	margin-top: 5px;
	width: 25px;
	height: 25px;
	background-image: url("/spring/resources/images/seok/naver_square.png");
}

#increasingbox {
	width: 1130px;
	height: 450px;
	border: 1px solid;
	clear:both;
}

#carouselExampleIndicators,#carouselExampleIndicators2 {
	width: 500px;
	height: 300px;
	border: 0px solid red;
	overflow: hidden; 
}

.carousel-item > img{
	width: 450px;
}

.image-cover {
    position: relative;
    height: 300px;
    cursor: pointer;
}

.image-cover::before {
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    /* Adjust the color values to achieve desired darkness */
    background: linear-gradient(to top, rgba(0, 0, 0, 0.75), rgba(0, 0, 0, 0.25));
}

.floatbox{
	float: left;
	margin: 200px 20px 20px 20px;
}

.floatbox > h3{
	font-family: 'BMHANNAAir';
}

.floatbox > h3 > span{
	font-family: 'BMHANNAAir';
	font-size: .85em;
}

#directprice{
	width: 200px;
	
}

#directpricebt{
	margin-left: 20px;
}

</style>
<div id="mycontents">
	<div id="pageTitle">
		<h1 class="page-header" style="font-size: 1.5em;">Buy Goods</h1>
	</div>



	<span class="inputTitle" id="title" style="float: left;">${dto.seq}.
		[${dto.brand}] ${dto.title } </span>
	<div id="heartbox">

		<i id="heartbtn" class="fas fa-heart"
			<c:if test="${isheart=='1'}">style="color: tomato; margin-left: 10px;"</c:if>
			<c:if test="${isheart=='0'}">style="color: gray; margin-left: 10px;"</c:if>></i>
		<c:if test="${empty mybidprice}">
		<div id="mybidbox" style="float: left;">
		</div>
		</c:if>
		<c:if test="${not empty mybidprice}">
			<div id="mybidbox" class="shadow-lg p-3 mb-5 bg-white rounded">
				<div>
					<p><i class="fas fa-hand-paper"></i> _ 내가 응찰한 가격</p>
					<p style="font-size: 2em; margin-top: -20px;"><fmt:formatNumber value="${mybidprice}"
								pattern="#,###"></fmt:formatNumber></span>원</p>
				</div>
				<div id="possiblebox">
				<c:if test="${mybidprice < dto.nowprice }">
					<i class="fas fa-sad-tear" style="color: red;"></i>
				</c:if>
				<c:if test="${mybidprice eq dto.nowprice }">
					<i class="fas fa-smile-wink" style="color: cornflowerblue;"></i>
				</c:if>
			</div>
			</div>
			
		</c:if>
	</div>
	<div id="sharebox">
		<div id="fb-root"></div>
		<script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v3.0";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));</script>

		<!-- Your share button code -->
		<div class="fb-share-button"
			data-href="http://211.63.89.49:8090/spring/goods/goodsbuyer.action"
			data-layout="button_count"></div>

		<input id="naverbtn" type="button" value="" onclick="sharenaver()"
			style="margin-top: 10px;" />
		<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

		<a href="javascript:;" id="kakao-link-btn" style="margin-left: 5px;"> <img
			src="//developers.kakao.com/assets/img/about/logos/kakaolink/kakaolink_btn_small.png"
			width="25px" style="margin-bottom: 10px;" />
		</a>

		<script type="text/javascript">
  //<![CDATA[
    // // 사용할 앱의 JavaScript 키를 설정해 주세요.
    Kakao.init('390b20b8e57efa30250011bb35c1b9a6');
    // // 카카오링크 버튼을 생성합니다. 처음 한번만 호출하면 됩니다.
    Kakao.Link.createDefaultButton({
      container: '#kakao-link-btn',
      objectType: 'feed',
      content: {
        title: document.title,
        description: '내용, 주로 해시태그',
        imageUrl: 'http://mud-kage.kakao.co.kr/dn/Q2iNx/btqgeRgV54P/VLdBs9cvyn8BJXB3o7N8UK/kakaolink40_original.png',
        link: {
        	mobileWebUrl: 'https://developers.kakao.com',
            webUrl: 'https://developers.kakao.com'
        }
      },
      social: {
        likeCount: 286,
        commentCount: 45,
        sharedCount: 845
      },
      buttons: [
        {
          title: 'Open!',
          link: {
        	  mobileWebUrl: 'https://developers.kakao.com',
              webUrl: 'https://developers.kakao.com'
          }
        }  
      ]
    });
  //]]>
</script>

	</div>
	<!-- 공유 박스 끝  -->
	<div style="clear: both;"></div>
	<div id="topbox">
		<div id="goodsimgs">
			<div class="imgbox">
				<img id="mainImg" src="/spring/resources/files/${mainimg}" />
			</div>

			<div id="goodssubImgs">
				<c:forEach items="${subimglist}" var="subimg">
					<div class="subimgbox">
						<img class="subimg" src="/spring/resources/files/${subimg}" />
					</div>
				</c:forEach>
				<c:forEach begin="1" end="${3-subimglist.size()}">
					<div class="subimgbox">
						<img class="subimg"
							src="/spring/resources/images/seok/noimage.jpg" />
					</div>
				</c:forEach>

				<h2>판매자 정보</h2>
				<ul>
					<li>이름: ${dto.sellername }</li>
					<li>E-mail: ${dto.selleremail }</li>
				</ul>

			</div>


		</div>

		<div style="padding: 20px;" id="addbox"
			class="shadow-lg p-3 mb-5 bg-white rounded">
			<div class="lineinput">
				<span class="inputTitle">- 경매종료까지 남은시간 :<span
					style="font-size: 0.45em;">${dto.deadline}(마감)</span></span>

			</div>
			<div id="filpclockbox">
			<c:if test="${remain>0}">
				<div class="clock" style="margin: 2em;"></div>
			</c:if>
			<c:if test="${remain<0}">
				<div>
					<span style="color: tomato; font-size:1.5em; margin-left:30px; font-weight: bold;">경매가 종료되었습니다!!</span>
				</div>
			</c:if>
				<div class="message"></div>
				<script type="text/javascript">
						var clock;
						
						$(document).ready(function() {
							var clock;
						
							clock = $('.clock').FlipClock({
						        clockFace: 'DailyCounter',
						        autoStart: false,
						        callbacks: {
						        	stop: function() {
						        		$('.message').html('The clock has stopped!')
						        	}
						        }
						    });
								    
						    clock.setTime(${remain});
						    clock.setCountdown(true);
						    clock.start();
						
						});
					</script>
			</div>
			<div style="clear: both;"></div>

			<div id="categoryBox lineinput" style="margin-bottom: 20px;">
				<span class="inputTitle">- 상품분류 :</span> <span class="smalltxt">${dto.bigcategory}</span>
				> <span class="smalltxt">${dto.smallcategory }</span>
			</div>
			<div style="clear: both;"></div>
			<div class="lineinput">
				<span class="inputTitle">- 상품명(브랜드) :</span><span class="smalltxt">${dto.goodname}
					(${dto.brand})</span>
			</div>
			<div style="clear: both;"></div>

			<div class="lineinput">
				<span class="inputTitle">- 현재입찰가 :</span><span class="smalltxt"><fmt:formatNumber
						value="${dto.nowprice}" pattern="#,###"></fmt:formatNumber></span>원
			</div>
			<div style="clear: both;"></div>
			<div class="lineinput">
				<span class="inputTitle">- 현재호가 :</span><span class="smalltxt"><fmt:formatNumber
						value="${dto.askingprice}" pattern="#,###"></fmt:formatNumber></span>원
			</div>
			<ul>
				<li>택배 - 무료배송 (cj 대한통운)</li>
				<fmt:parseNumber var="bonus" integerOnly="true"
					value="${dto.nowprice/100}"></fmt:parseNumber>
				<li>구매시, <span><fmt:formatNumber value="${bonus}"
							pattern="#,###"></fmt:formatNumber></span>원 적립가능~~!!
				</li>
			</ul>
			<div style="clear: both;"></div>

			<div id="btns">
				<button class="btn btn-default teamblack" <c:if test="${remain<0}">disabled style="cursor:not-allowed ;" </c:if> >
					<i class="fas fa-shopping-cart"></i><br>즉시구매<br> <span>(<fmt:formatNumber
							value="${dto.instantprice}" pattern="#,###"></fmt:formatNumber>원)
					</span>
				</button>
				
				<button class="btn btn-default teamblack" onclick="if(confirm('응찰하시겠습니까?'))location.href= '/spring/goods/bidupdate.action?auctionseq=${dto.seq}&mebidprice=${dto.nowprice+dto.askingprice}';"
				<c:if test="${remain<0}">disabled style="cursor:not-allowed ;"</c:if>>
					<i class="fas fa-money-bill-alt"></i><br>호가로<br>응찰하기
				</button>
			</div>
			<div style="margin: 20px 0px 20px 20px;">
			<input type="number" id="directprice" class="form-control" placeholder="직접 응찰가 입력" min="${dto.nowprice+dto.askingprice}" max="${dto.instantprice}" value="${dto.nowprice+dto.askingprice}" />
			<button class="btn btn-default teamblack" id="directpricebt"
				<c:if test="${remain<0}">disabled style="cursor:not-allowed ;"</c:if>>
					<i class="fas fa-money-bill-alt"></i>&nbsp;직접응찰가로응찰하기
				</button>
			</div>

		</div>
	</div>

	<div id="bottombox">
		<span style="font-size: 3em; padding: 30px;">상품의 상세정보 </span>
		<div style="padding: 20px;">${dto.detail }</div>
		
		<div id="increasingbox">
			<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>



		<script type="text/javascript">
// Data retrieved from http://vikjavev.no/ver/index.php?spenn=2d&sluttid=16.06.2015.

Highcharts.chart('container', {
    chart: {
        type: 'spline',
        scrollablePlotArea: {
            minWidth: 600,
            scrollPositionX: 1
        }
    },
    title: {
        text: '${dto.seq}.${dto.goodname}(${dto.brand})의 응찰액 증가추이'
    },
    subtitle: {
        text: '한시간 단위의 응찰액 증가추이를 나타낸 그래프입니다.'
    },
    xAxis: {
        type: 'datetime',
        labels: {
            overflow: 'justify'
        }
    },
    yAxis: {
        title: {
            text: '응찰가 (단위: 원)'
        },
        minorGridLineWidth: 0,
        gridLineWidth: 0,
        alternateGridColor: null,
        plotBands: [{ // Light air
            from: 0,
            to: 20000,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
                text: '0~5000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // Light breeze
            from: 20000,
            to: 40000,
            color: 'rgba(0, 0, 0, 0)',
            label: {
                text: '5000~10000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // Gentle breeze
            from: 40000,
            to: 60000,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
                text: '10000~15000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // Moderate breeze
            from: 60000,
            to: 80000,
            color: 'rgba(0, 0, 0, 0)',
            label: {
                text: '15000~20000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // Fresh breeze
            from: 80000,
            to: 100000,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
                text: '20000~25000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // Strong breeze
            from: 100000,
            to: 120000,
            color: 'rgba(0, 0, 0, 0)',
            label: {
                text: '25000~30000 won',
                style: {
                    color: '#606060'
                }
            }
        }, { // High wind
            from: 120000,
            to: 200000,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
                text: '30000~ won',
                style: {
                    color: '#606060'
                }
            }
        }]
    },
    tooltip: {
        valueSuffix: ' won'
    },
    plotOptions: {
        spline: {
            lineWidth: 4,
            states: {
                hover: {
                    lineWidth: 5
                }
            },
            marker: {
                enabled: false
            },
            pointInterval: 3600000, // one hour
            pointStart: Date.UTC(<%=Calendar.getInstance().get(Calendar.YEAR)%>,
            		<%=Calendar.getInstance().get(Calendar.MONTH)+1%>,
            		<%=Calendar.getInstance().get(Calendar.DATE)-2%>, 
            		<%=Calendar.getInstance().get(Calendar.HOUR)%>, 
            		<%=Calendar.getInstance().get(Calendar.MINUTE)%>, 
            		<%=Calendar.getInstance().get(Calendar.SECOND)%>)
        }
    },
    series: [{
        name: '${dto.goodname}(${dto.brand})',
        data: [
            10000, 10000, 10000, 10000, 11000, 12000, 12000, 12000, 12000, 13000, 13000, 13000,
            14000, 15000, 16000, 17000, 17000, 17000, 17000, 17000, 17000, 18000, 18000, 18000,
            19000, 20000, 30000, 34000, 34000, 34000, 34000, 34000, 34000, 40000, 40000, 40000,
            40000, 45000, 45000, 55000, 60000, 80000, 100000, 110000, 120000, 125000, 130000, 131000,
            132000
        ]

    }],
    navigation: {
        menuItemStyle: {
            fontSize: '10px'
        }
    }
});
		</script>
		</div>
	</div>
<div class="floatbox">
	<h3 class="page-header">판매자(${dto.sellername })의 다른 상품</h3>
	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators" >	
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<c:forEach items="${othergoodlist}" var="otherdto" varStatus="status" begin="1"  >
				<li data-target="#carouselExampleIndicators" data-slide-to="${status.step}"></li>
			</c:forEach>
		</ol>
		<div class="carousel-inner" role="listbox">
			
			<div class="carousel-item active">
				<div class="image-cover">
				<img class="d-block img-fluid"
					src="/spring/resources/files/${dto.mainimg}"
					alt="First slide">
				</div>
				<div class="carousel-caption d-none d-md-block">
					<h3>${dto.title }</h3>
					<p>${dto.bigcategory} > ${dto.smallcategory}</p>
					<p>현재 입찰가 : ${dto.nowprice }원</p>
				</div>
			</div>
			<c:forEach items="${othergoodlist}" var="otherdto">
				<div class="carousel-item">
					<div class="image-cover">
					<img class="d-block img-fluid"
						src="/spring/resources/files/${otherdto.mainimg}"
						alt="slide">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h3>${otherdto.title }</h3>
						<p>${otherdto.bigcategory} > ${otherdto.smallcategory}</p>
						<p>현재 입찰가 : ${otherdto.nowprice }원</p>
					</div>
				</div>
			</c:forEach>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
</div>

<div class="floatbox">
	<h3 class="page-header">(<span>${dto.smallcategory} > ${dto.bigcategory}</span>) 카테고리의 다른상품</h3>
	<div id="carouselExampleIndicators2" class="carousel slide"
		data-ride="carousel">
		
		<div class="carousel-inner" role="listbox">
			
			<div class="carousel-item active">
				<div class="image-cover">
				<img class="d-block img-fluid"
					src="/spring/resources/files/${dto.mainimg}"
					alt="First slide">
				</div>
				<div class="carousel-caption d-none d-md-block">
					<h3>${dto.title }</h3>
					<p>${dto.bigcategory} > ${dto.smallcategory}</p>
					<p>현재 입찰가 : ${dto.nowprice }원</p>
				</div>
			</div>
			<c:forEach items="${samegoodlist}" var="otherdto">
				<div class="carousel-item">
					<div class="image-cover" onclick="location.href='/spring/goods/goodsbuyer.action?seq=${otherdto.seq}'">
					<img class="d-block img-fluid"
						src="/spring/resources/files/${otherdto.mainimg}"
						alt="slide" >
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h3>${otherdto.title }</h3>
						<p>${otherdto.bigcategory} > ${otherdto.smallcategory}</p>
						<p>현재 입찰가 : ${otherdto.nowprice }원</p>
					</div>
				</div>
			</c:forEach>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators2"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators2"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
</div>
<div style="clear: both;"></div>


	</form>
</div>
