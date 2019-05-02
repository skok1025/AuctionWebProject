package com.auction.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/index123.action", method = { RequestMethod.GET })
	public String index(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {
		
		// 1 : goods, admin, customer -- > 서브메뉴 명
		// 2 : 자기 업무 폴더명 (views 폴더 하위에 있는 업무 폴더들...account, goods, mypage, ....)
		// 3 : 자기 업무 jsp 파일명
		
		return "customer.template.mytemplate";
	}
	
}
