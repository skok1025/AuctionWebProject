package com.auction.goods;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.auction.account.MemberDTO;
import com.auction.main.SearchDTO;

/**
 * 상품 관련 Controller 클래스
 * @author 김석현
 *
 */
@Controller
public class GoodsController {
	
	/**
	 * 응찰 확인 Service로 이동
	 */
	@Autowired
	private IWinningBidPay winningBid;
	
	@Autowired
	private IGoodsSeller sservice;
	
	@Autowired
	private IGoodsBuyer bservice;
	
	@Autowired
	private IList service;
	
	/**
	 * 판매자가 상품을 등록하는 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
	 * @param resp HttpServletResponse 객체
	 * @param session HttpSession 객체
	 * @return 해당 페이지
	 */
	@RequestMapping(value = "/goods/addseller.action", method = { RequestMethod.GET })
	public String addseller(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {
		System.out.println(req.getRealPath("resources/files"));
		
		List<GoodsBigCategoryDTO> blist = sservice.getBigCategoryList();
		List<GoodsSmallCategoryDTO> smallbasicList = sservice.getSmallList("1");
		
		req.setAttribute("blist", blist);
		req.setAttribute("smallbasicList", smallbasicList);
		return "goods.goods.addseller";
	}
	
	/**
	 * 상품 대분류에 맞는 소분류 리스트를 반환하는 메소드
	 * @param req HttpServletRequest 객체
	 * @param resp HttpServletResponse 객체
	 * @param session HttpSession 객체
	 * @param bseq 상품 대분류 번호
	 * @return 대분류에 해당하는 소분류리스트
	 * @throws Exception
	 */
	@RequestMapping(value = "/goods/getsmallcategory.action", method = { RequestMethod.GET })
	public @ResponseBody List<GoodsSmallCategoryDTO> Getsmallcategory(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String bseq) throws Exception {
		
		
		return sservice.Getsmallcategory(bseq);
	}
	
	/**
	 * 판매자가 상품을 등록하는 처리를 하는 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
	 * @param resp HttpServletResponse 객체
	 * @param session HttpSession 객체
	 * @param dto 등록할 상품 dto
	 * @return 등록처리 페이지
	 */
	@RequestMapping(value = "/goods/addsellerok.action", method = { RequestMethod.POST })
	public String addsellerok(HttpServletRequest req,HttpServletResponse resp,HttpSession session,AuctionGoodsDTO dto) {
		dto.setDeadline(dto.getDeadline()+":00");
		System.out.println(dto.getDeadline());
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest) req;
		MultipartFile mainattach = multi.getFile("mainattach"); //첨부 파일 참조 객체
		MultipartFile subattach1 = multi.getFile("subattach1"); //첨부 파일 참조 객체
		MultipartFile subattach2 = multi.getFile("subattach2"); //첨부 파일 참조 객체
		MultipartFile subattach3 = multi.getFile("subattach3"); //첨부 파일 참조 객체
		
		// ======================
		String filename = getFileName(req.getRealPath("resources/files"), mainattach.getOriginalFilename());
		
		
		File file = new File(req.getRealPath("resources/files")+"\\"+filename);
		try {
			//스프링이 받아 놓은 첨부파일을 임시폴더에서 우리가 희망하는 폴더에 이동하기
			mainattach.transferTo(file); //업로드 완료
			
		} catch (Exception e) {
			System.out.println("FileController.addok() : " + e.toString());
		}
		
		System.out.println(dto);
		dto.setMainimg(filename);
		
		// ======================
		
		filename = getFileName(req.getRealPath("resources/files"), subattach1.getOriginalFilename());
		
		file = new File(req.getRealPath("resources/files")+"\\"+filename);
		
		try {
			//스프링이 받아 놓은 첨부파일을 임시폴더에서 우리가 희망하는 폴더에 이동하기
			subattach1.transferTo(file); //업로드 완료
			
		} catch (Exception e) {
			System.out.println("FileController.addok() : " + e.toString());
		}
		dto.setSubimg1(filename);
		
		// =======================
		
		filename = getFileName(req.getRealPath("resources/files"), subattach2.getOriginalFilename());
		
		file = new File(req.getRealPath("resources/files")+"\\"+filename);
		
		try {
			//스프링이 받아 놓은 첨부파일을 임시폴더에서 우리가 희망하는 폴더에 이동하기
			subattach2.transferTo(file); //업로드 완료
			
		} catch (Exception e) {
			System.out.println("FileController.addok() : " + e.toString());
		}
		dto.setSubimg2(filename);
		
		// =======================
		
		filename = getFileName(req.getRealPath("resources/files"), subattach3.getOriginalFilename());
		
		file = new File(req.getRealPath("resources/files")+"\\"+filename);
		
		try {
			//스프링이 받아 놓은 첨부파일을 임시폴더에서 우리가 희망하는 폴더에 이동하기
			subattach3.transferTo(file); //업로드 완료
			
		} catch (Exception e) {
			System.out.println("FileController.addok() : " + e.toString());
		}
		dto.setSubimg3(filename);
		
		// =======================
		dto.setMemberseq(session.getAttribute("memberseq").toString());
		
		sservice.addsellerok(dto);
		int result = 1;
		
		dto.setSeq(sservice.getMaxSeq());
		
		System.out.println(result);
		req.setAttribute("result", result);
		req.setAttribute("dto", dto);
		return "goods.goods.addsellerok";
	}
	
	/**
	 * 구매자가 보는 특정상품에 대한 상세정보 페이지
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param seq 해당 상품번호
	 * @return 해당 상품의 상새정보 페이지
	 */
	@RequestMapping(value = "/goods/goodsbuyer.action", method = { RequestMethod.GET })
	public String goodsbuyer(HttpServletRequest req,HttpServletResponse resp,
			HttpSession session,String seq) {
		
		
		
		System.out.println(req.getRealPath("/resources/files"));
		
		// 관심상품에 존재하는지 // 상품번호, 회원번호
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("auctionseq", seq);
		map.put("memberseq", "1");
		int isHeart = bservice.isheart(map);
		String isheart = String.valueOf(isHeart);
		
		// AuctionGoods.seq 넘겨줌
		AuctionInfoDTO dto = bservice.get(seq);
		System.out.println(dto.getDeadline().toString());
		System.out.println(dto.getDeadline().toString().substring(0, 10).replace("-", ""));
		System.out.println(dto.getDeadline().toString().substring(11).replace(":", "")+"00");
		// mainImg 가져옴
		String mainImg = bservice.getMainImg(seq);
		
		
		
		// subImg 들 가져오기
		List<String> subimglist = bservice.getSubimgs(seq);
		
		// 상품 경매 남은시간 가져오기
		int remain = bservice.getremain(seq);
		
		// 같은 판매자의 다른 상품리스트 가져오기
		List<AuctionInfoDTO> othergoodlist = bservice.getothergoodlist("1"); //memberseq 넘김
		
		// 같은 카테고리의 상품을 확인
		List<AuctionInfoDTO> samegoodlist = bservice.getsamegoodlist(dto.getSmallcategoryseq());
		
		// 이 상품에 대한 나의 응찰가격 가져오기 (회원 번호, 상품번호)
		String mybidprice = bservice.getMyBidPrice(map);
		
		req.setAttribute("dto", dto);
		req.setAttribute("mainimg", mainImg);
		req.setAttribute("subimglist", subimglist);
		req.setAttribute("remain", remain);
		req.setAttribute("isheart", isheart);
		req.setAttribute("othergoodlist", othergoodlist);
		req.setAttribute("samegoodlist", samegoodlist);
		
		req.setAttribute("mybidprice", mybidprice);
		
		return "goods.goods.goodsbuyer";
	}
	
	/**
	 * 관심상품 등록하는 메소드
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param auctionseq 상품번호
	 * @param memberseq 회원번호
	 * @return 관심상품 등록 성공유무
	 */
	@RequestMapping(value = "/goods/addheart.action", method = { RequestMethod.GET })
	public @ResponseBody int addheart(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String auctionseq,String memberseq) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("auctionseq", auctionseq);
		map.put("memberseq",memberseq);
		
		int result = bservice.addheart(map);
		
		
		
		return result;
	}

	/**
	 * 관심상품 삭제하는 메소드
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param auctionseq 상품번호
	 * @param memberseq 회원번호
	 * @return 관심상품 삭제 성공유무
	 */
	@RequestMapping(value = "/goods/delheart.action", method = { RequestMethod.GET })
	public @ResponseBody int delheart(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String auctionseq,String memberseq) {
		memberseq = "1"; // 수정 요망
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("auctionseq", auctionseq);
		map.put("memberseq",memberseq);
		
		int result = bservice.delheart(map);
		
		
		return result;
	}
	
	/**
	 * 상품 응찰가 등록하는 메소드
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param auctionseq 상품번호
	 * @param mebidprice 나의 입찰가
	 * @return 상품 응찰처리 페이지
	 */
	@RequestMapping(value = "/goods/bidupdate.action", method = { RequestMethod.GET })
	public String bidupdate(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String auctionseq,String mebidprice) {
		
		String memberseq = "1"; // 로그인한 memberseq
		// 세션에서 회원번호 가져와야 한다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("memberseq", memberseq);
		map.put("auctionseq", auctionseq);
		
		bservice.bidupdate(map);
		
		req.setAttribute("mebidprice", mebidprice);
		req.setAttribute("auctionseq", auctionseq);
		return "goods.goods.bidupdate";
	}
	
	/**
	 * 구매자가 입찰에 응하면 해당 판매자에게 SMS 를 통해 안내메세지를 전송하는 메소드
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param seq 경매상품 번호
	 * @param mebidprice 응찰가
	 * @return SMS 전송처리 페이지
	 */
	@RequestMapping(value = "/goods/smssend.action", method = { RequestMethod.GET })
	public String smssend(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String seq,String mebidprice) {
		String message;
		String memberseq = "1"; // 로그인한 회원번호
		
		
		MemberDTO mdto = bservice.getMemberDTO(memberseq);
		AuctionGoodsDTO adto = bservice.getAuctionGoodsDTO(seq);
		
		
		// 구매자 아이디,응찰가,구입 항목
		message = "[너쓸랭 입찰 안내메세지]\n"+mdto.getName()+"("+mdto.getEmail()+")"+"님이\n"+"'"+adto.getGoodname()+"'"+"를"+mebidprice+"원에 입찰!";
			
		// 판매자 번호
		String sellertel = bservice.getSellerTel(seq); // 상품번호를 넘김
		// seq 경매 상품번호
		req.setAttribute("seq", seq);
		
		// 판매자 전화번호
		req.setAttribute("sellertel", sellertel);
		
		req.setAttribute("message", message);
		return "goods.goods.smssend";
	}
	
	/**
	 * 판매자에게 상품의 경매시간이 종료되었음을 알리는 메소드
	 * @param req HttpServletRequest
	 * @param resp HttpServletResponse
	 * @param session HttpSession
	 * @param seq 경매상품 번호
	 * @return SMS 전송처리 페이지
	 */
	@RequestMapping(value = "/goods/smssendseller.action", method = { RequestMethod.GET })
	public String smssendseller(HttpServletRequest req,HttpServletResponse resp,HttpSession session,String seq) {
		String message;
		String memberseq = "1"; // 로그인한 회원번호
		String rdate=null; // 경매종료 날짜 (문자 발송 예약시간)
		String rtime=null;
		
		MemberDTO mdto = bservice.getMemberDTO(memberseq);
		AuctionGoodsDTO adto = bservice.getAuctionGoodsDTO(seq);
		
		System.out.println(adto.getDeadline());
		
		String deadline = adto.getDeadline();
		rdate = deadline.toString().substring(0, 10).replace("-", "");
		rtime = deadline.toString().substring(11,19).replace(":", "");
		message = "[너쓸랭 경매종료]\n"+mdto.getName()+"("+mdto.getEmail()+")"+"님이 등록하신\n"+"'"+adto.getGoodname()+"'"+"경매종료";
			
		
		// 판매자 번호
		String sellertel = bservice.getSellerTel(seq); // 상품번호를 넘김
		// seq 경매 상품번호
		req.setAttribute("seq", seq);
		
		// 판매자 전화번호
		req.setAttribute("sellertel", sellertel);
		
		
		
		req.setAttribute("rdate", rdate);
		req.setAttribute("rtime", rtime);
		
		req.setAttribute("message", message);
		return "goods.goods.smssendseller";
	}
	
	
	private String getFileName(String path, String filename) {

		// 중복파일명을 인덱스 붙이기
		int n = 1; 
		
		// a.zip -> a(1).zip
		int index = filename.lastIndexOf(".");
		String tempName = filename.substring(0, index);
		String tempExt = filename.substring(index);
		
		while(true) {
			File file = new File(path + "\\"+filename);
			
			if(file.exists()) {
				// 이름 고치기
				filename = tempName+"("+n+")"+tempExt;
				n++;
			} else {
				return file.getName();
			}
		}
		
		//return null;
	}
	
	
	
	
	
	///////////////////////////////////////////
	/**
	 * 메인 페이지를 호출하기 위한 메소드
	 * @author 이희규
	 * @param req HttpServletRequest 객체
	 * @param resp HttpServletResponse 객체
	 * @param session HttpSession 객체
	 * @return JSP
	 */
	@RequestMapping(value = "/goods/index.action", method = { RequestMethod.GET })
	public String index(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {

		//1. 카테고리 가져오기
		//1. 상품 카테고리(대분류) 가져오기 > dao 위임 > select
		//2. jsp 반환 + 카테고리 목록
		
		
		//2. 실시간 상품
		//1. 상품 가져오기 (등록일 내림차순) 
		//2. DAO 위임 > select > jsp 반환
		
		//3. 관심상품
		//1. 관심상품 가져오기
		//2. DAO 위임 > select > jsp 반환
		
		//4. 인기검색어
		//1. DAO 위임 > select  > jsp 반환
		
		
		
		
		//1-1.
		List<GoodsBigCategoryDTO> bigCategoryList = service.getBigCategory();
		
		System.out.println(bigCategoryList.size());
		System.out.println(bigCategoryList.toString());
		
		
		
		//2-1.
		List<AuctionGoodsDTO> realGoodsList = service.realGoodsList();
		
		//3
		if (session.getAttribute("memberseq") != null) {
			List<AuctionGoodsDTO> interestList = service.interestList(session.getAttribute("memberseq").toString());
			req.setAttribute("interestList", interestList);
			session.setAttribute("interestList", interestList);
		} 
		
		//4.
		List<SearchDTO> searchList = service.searchList();
		
		//5. 현재 시각 가져오기
		
		Date date = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String nowTime = dateFormat.format(date);

		System.out.println("nowTime == "+nowTime);
		
		//2-2.
		//1-2.
		req.setAttribute("bigCategory", bigCategoryList);
		req.setAttribute("realGoodsList", realGoodsList);
		req.setAttribute("searchList", searchList);
		req.setAttribute("nowTime", nowTime);
		
		session.setAttribute("searchList", searchList);
		
		return "goods.goods.index";
	}
	
	
	/**
	 * 니쓸랭 베스트 상품을 호출하기 위한 메소드
	 * @author 이희규
	 * @param req HttpServletRequest 객체
	 * @param resp HttpServletResponse 객체
	 * @param session HttpSession 객체
	 * @param seq 베스트 상품 카테고리 seq 번호
	 * @return JSON
	 */
	  @RequestMapping(value = "/goods/categoryGoods.action", method = {RequestMethod.GET }) 
	  public @ResponseBody List<AuctionGoodsDTO> categoryGoods(HttpServletRequest req,HttpServletResponse resp, HttpSession session,String seq) {//1.
	  
	  //1. 데이터가져오기 (seq) 
	  //2. dao 위임 -> select 
	  //3. JSON 반환
	  
	   //2.
		List<AuctionGoodsDTO> list = service.getCategoryGoodsLog(seq);
		
		
		
		//3.
		return list;
	  }
	  
	  /**
	   * 니쓸랭 신시간 상품을 호출하기 위한 메소드
	   * @author 이희규
	   * @param req HttpServletRequest 객체
	   * @param resp HttpServletResponse 객체
	   * @param session HttpSession 객체
	   * @return JSON
	   */
	  @RequestMapping(value = "/goods/realGoods.action", method = { RequestMethod.GET })
	public @ResponseBody List<AuctionGoodsDTO> realGoods(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		//1. DAO 위임 > select > List 가져오기
		//2. JSON 반환
		  
		  //1.
		  List<AuctionGoodsDTO> realGoodsList = service.realGoodsList();
		  

		return realGoodsList;
	}
	  
	  /**
	   * 검색 결과에 대한 페이지를 불러오는 메소드
	   * @author 이희규 
	   * @param req HttpServletRequest 객체
   	   * @param resp HttpServletResponse 객체
	   * @param session HttpSession 객체
	   * @param search 검색어
	   * @return JSP
	   */
	  @RequestMapping(value = "/goods/searchGoods.action", method = { RequestMethod.GET })
	public String searchGoods(HttpServletRequest req, HttpServletResponse resp, HttpSession session,String search) {//1.

		//1.데이터가져오기(search)
		//2.DAO 위임 > select > AuctionGoodsDTO 반환
		//3.jsp 반환, 검색어 반환
		  
		  //2.
		  List<AuctionGoodsDTO> list = service.searchList(search);
		  
		  
		  //4. 현재 시각 가져오기
			
			Date date = new Date();

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String nowTime = dateFormat.format(date);

			System.out.println("nowTime == "+nowTime);
		  
			//3.
			req.setAttribute("searchGoodsList", list);
			req.setAttribute("searchWord", search);
			req.setAttribute("nowTime", nowTime);

		return "goods.goods.search";
	}
	  
	  /**
	   * 메뉴에서 상품 카테고리를 선택하면 카테고리에 따른 상품 리스트 페이지를 호출하기 위한 메소드
	   * @author 이희규
	   * @param req HttpServletRequest 객체
   	   * @param resp HttpServletResponse 객체
	   * @param session HttpSession 객체
	   * @param smallCategorySeq 카테고리 선택 번호
	   * @return JSP
	   */
	  @RequestMapping(value = "/goods/smallCategoryGoods.action", method = { RequestMethod.GET })
	public String smallcategoryGoods(HttpServletRequest req, HttpServletResponse resp, HttpSession session,String smallCategorySeq) {//1.

		//1. 데이터 가져오기(상품 소분류 번호)
		//2. DAO 위임 > select > 상품 정보 가져오기(AuctionGoodsDTO)
		//3. JSP 반환
		  
		  System.out.println("category : "+ smallCategorySeq);
		  
		  //2.
		  List<AuctionGoodsDTO> list = service.getCategoryGoods(smallCategorySeq);
		  
		  //3.
		  req.setAttribute("goodsList", list);
		  
		  //4. 선택한 상품 카테고리 이름 가져오기
		  String category = service.getSmallCategory(smallCategorySeq);
		  
		  req.setAttribute("category", category);
		  
		  //5. 현재 시각 가져오기
			
		 Date date = new Date();

		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
		 String nowTime = dateFormat.format(date);

		 System.out.println("nowTime == "+nowTime);
		 
		 req.setAttribute("nowTime", nowTime);

		return "goods.goods.categoryGoods";
	}
	  
	  /**
		 * 낙찰 확인 리스트 호출
		 * @param req
		 * @param resp
		 * @param session
		 * @param memberid
		 * @return
		 */
		@RequestMapping(value = "/goods/winningBidPay.action", method = { RequestMethod.GET })
		public String winningBidPay(HttpServletRequest req, HttpServletResponse resp, HttpSession session, String memberid) {
			
			List<WinningBidPayDTO> winning = winningBid.winning(session.getAttribute("memberseq").toString());

			req.setAttribute("winning", winning);
			
			return "goods.goods.winningBidPay";
		}
	
}
