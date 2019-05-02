package com.auction.account;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
	
	@Autowired
	private IAccount service;
	
	@RequestMapping(value = "/account/login.action", method = { RequestMethod.GET })
	public String login(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		

		return "login";
	}
	
	@RequestMapping(value = "/account/loginok.action", method = { RequestMethod.POST })
	public void loginok(HttpServletRequest req, HttpServletResponse resp, HttpSession session,String id,String password) { //1.

		//1.데이터 가져오기(id,password)
		//2.DAO 위임 > select > 결과 반환(1,0)
		//3. 결과 1 -> 로그인 처리
		//3. 결과 0 -> 경고 처리 후 다시 로그인하기
		
		//1.데이터 가져오기(id,password)
		//System.out.println(id);
		//System.out.println(password);
		
		resp.setCharacterEncoding("utf-8"); //<filter>와 무관
		
		//2.
		HashMap<String,String> loginMap= new HashMap<String,String>();
		loginMap.put("id", id);
		loginMap.put("password", password);
		
		int result = service.login(loginMap);
		
		
		//3-1.
		
		try {
			
			
			PrintWriter writer = resp.getWriter();
			
			
			if (result == 1) {
				
				AllMemberDTO mdto = service.getInfo(id);
				
				session.setAttribute("memberseq", mdto.getSeq());
				session.setAttribute("email",mdto.getEmail());
				session.setAttribute("name", mdto.getName());
				
				System.out.println("test");
				
				writer.println("<html>");
				writer.println("<head>");
				writer.println("<meta charset='utf-8'>");
				writer.println("</head>");
				writer.println("<body>");
				writer.println("<script>");
				writer.println("location.href='/spring/goods/index.action';");
				writer.println("</script>");
				writer.println("</body>");
				writer.println("</html>");
				
				writer.close();
			}else {
				
				writer.println("<html>");
				writer.println("<head>");
				writer.println("<meta charset='utf-8'>");
				writer.println("</head>");
				writer.println("<body>");
				writer.println("<script>");
				writer.println("alert('아이디 또는 비밀번호가 다릅니다. 다시 확인해주세요.'); history.back();");
				writer.println("</script>");
				writer.println("</body>");
				writer.println("</html>");
				
				writer.close();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@RequestMapping(value = "/account/logout.action", method = { RequestMethod.GET })
	public String logout(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {

		session.removeAttribute("memberseq");
		session.removeAttribute("email");
		session.removeAttribute("name");

		return "redirect:/goods/index.action"; //resp.sendRedirect()와 유사
	}

}












