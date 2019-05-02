package com.auction.refund;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auction.mypage.VwPurHistoryDTO;
/**
 * 환불 관련 Controller 클래스
 * @author 한종균
 *
 */
@Controller
public class RefundController {

	/**
	 * 환불 페이지 Service로 이동
	 */
	@Autowired
	private IRefund service;
	
	/**
	 * 구매자가 상품에 대한 환불을 등록하는 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
     * @param resp HttpServletResponse 객체
     * @param session HttpSession 객체
	 * @return 해당페이지
	 */
	@RequestMapping(value = "/refund/refundadd.action", method = { RequestMethod.GET })
	public String refundadd(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {

			
		String memberseq = "5";
		String auctionseq = req.getParameter("seq");
		
		System.out.println(auctionseq);
		
		List<RefundCategoryDTO> list = service.rfcategory();
		
		System.out.println(list);
		
		req.setAttribute("memberseq", memberseq);
		req.setAttribute("auctionseq", auctionseq);
		req.setAttribute("list", list);

		return "customer.refund.refundadd";
	}
	
	/**
	 * 구매자가 상품에 대한 환불을 등록하는 처리를 하는 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
     * @param resp HttpServletResponse 객체
     * @param session HttpSession 객체
	 * @param dto RefundDTO 객체
	 * @return 해당페이지
	 */
	@RequestMapping(value = "/refund/refundaddok.action", method = { RequestMethod.POST })
	public String refundaddok(HttpServletRequest req,HttpServletResponse resp,HttpSession session, RefundDTO dto) {

		
		String memberseq = req.getParameter("memberseq"); //회원번호
		String auctionseq = req.getParameter("auctionseq"); //경매상품 번호
		String refundseq = req.getParameter("refundseq"); //카테고리 번호
		String detail = req.getParameter("detail");//상세내용
		
		dto.setMemberseq(memberseq);
		dto.setAuctionseq(auctionseq);
		dto.setRefundseq(refundseq);
		dto.setDetail(detail);
		
		int result = service.refundaddok(dto);
		
		req.setAttribute("result",result);
		return "customer.refund.refundaddok";
	}
	
	/**
	 * 판매자가 자신의 환불 제재내역 페이지를 불러오는 메소드
	 * @param req HttpServletRequest 객체
     * @param resp HttpServletResponse 객체
     * @param session HttpSession 객체
	 * @return 해당페이지
	 */
	@RequestMapping(value = "/refund/refundlist.action", method = { RequestMethod.GET })
	public String refundlist(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {
		
		String sellerseq = "5";
		
		List<VwRefundDTO> list = service.refundlist(sellerseq);

		req.setAttribute("list", list);
		
		return "customer.refund.refundlist";
	}
}
