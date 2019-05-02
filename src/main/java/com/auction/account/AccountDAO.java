package com.auction.account;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSessionTemplate template;

	public int login(HashMap<String, String> loginMap) {

		
		return template.selectOne("account.login",loginMap);
	}

	public AllMemberDTO getInfo(String id) {

		return template.selectOne("account.getInfo", id);
	}


}
