package com.auction.statistics;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 관리자 통계관련 Controller 클래스
 * @author sist
 *
 */
@Controller
public class StatisticsController {
	
	@Autowired
	private IStatistics service;
	/*
	@RequestMapping(value = "/adminTest.action", method = { RequestMethod.GET })
	public String adminTest(HttpServletRequest req) {
		
		return "admin.statistics.adminMain";
	}
	*/
	/**
	 * 관리자 통계 페이지 호출을 위한 메소드
	 * @param req HttpServletRequest 객체
	 * @param seq 상품번호
	 * @return 관리자 통계페이지
	 */
	@RequestMapping(value = "/adminMain.action", method = { RequestMethod.GET })
	public String adminMain(HttpServletRequest req,String seq) {
		seq = "1"; // 상품번호
		
		List<String> bigList = service.getBigCategory();
		BidDTO dto = service.getBidData(seq);
		req.setAttribute("bigList", bigList);//카테고리 종류
		req.setAttribute("bdto",dto);
		return "admin.statistics.adminMain";
	}
	
}
