package com.auction.goods;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Cross {
	
	
	@Pointcut("execution(public String com.auction.goods.GoodsController.smssend(..))")
	public void pc1() {}
	
	@After("pc1()")
	public void m1() {
		System.out.println("메세지 전송완료");
	}
}
