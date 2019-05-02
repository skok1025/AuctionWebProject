package com.auction.mypage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 계정 관련 Controller 클래스
 * @author 한종균
 *
 */
@Controller
public class MyPageController {

	/**
	 * 마이 페이지 Service로 이동
	 */
	@Autowired
	private IMyPage service;
	
	/**
	 * 회원의 상품 구매내역 페이지를 불러오는 메소드
	* @param req HttpServletRequest 객체
    * @param resp HttpServletResponse 객체
    * @param session HttpSession 객체
	 * @param dto VwPurHistoryDTO 객체
	 * @return 해당 페이지
	 */
	@RequestMapping(value = "/mypage/purhistory.action", method = { RequestMethod.GET })
	public String index(HttpServletRequest req,HttpServletResponse resp,HttpSession session, VwPurHistoryDTO dto) {
		
		// 1 : goods, admin, customer -- > 서브메뉴 명
		// 2 : 자기 업무 폴더명 (views 폴더 하위에 있는 업무 폴더들...account, goods, mypage, ....)
		// 3 : 자기 업무 jsp 파일명
		
		String memberseq = "5";
		
		List<VwPurHistoryDTO> list = service.purlist(memberseq);
		
		/*System.out.println(list.get(1));*/
		/*date = date.substring(0,10);
		dto.setPayDate(date);*/
		
		
		
		req.setAttribute("list", list);
		
		return "customer.mypage.purhistory";
	}
	
	/**
	 * 회원의 응찰 내역 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
    * @param resp HttpServletResponse 객체
    * @param session HttpSession 객체
	 * @return 해당 페이지
	 */
	@RequestMapping(value = "/mypage/bidhistory.action", method = { RequestMethod.GET })
	public String bidhistory(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {

		String memberseq = "5";
		
		List<VwBidHistoryDTO> list = service.bidlist(memberseq);
		
		req.setAttribute("list", list);

		return "customer.mypage.bidhistory";
	}
}
