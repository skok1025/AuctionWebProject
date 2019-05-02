package com.auction.goods;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GoodsCross{
	
	@Autowired
	private ListDAO dao;
	
	
	@Pointcut("execution(public * com.auction.goods.GoodsController.searchGoods(..))")
	public void insSearch() {} //검색어를 DB에 저장
	
	//보조업무 구현 + 위빙(포인트 컷 + Advice)
	@After("insSearch()")
	public void search(JoinPoint joinPoint) {
		
		//주업무 메소드의 매개변수 리스트 참조
		Object[] args =  joinPoint.getArgs();
		
		//검색어
		 String search= args[3].toString();
		 
		 //세션 가져오기
		 HttpSession session = (HttpSession)args[2];
		 
		 //회원번호
		 String memberseq = null;
		 
		 if (session.getAttribute("memberseq") != null) {
			 memberseq = session.getAttribute("memberseq").toString();
		}
		 
		 HashMap<String,String> map = new HashMap<String,String>();
		 map.put("search", search);
		 map.put("memberseq", memberseq);
		
		dao.search(map);
		
	}
	
}






