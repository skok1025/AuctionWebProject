package com.auction.account;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccount {
	
	@Autowired
	private AccountDAO dao;

	@Override
	public int login(HashMap<String, String> loginMap) {
		
		return dao.login(loginMap);
	}

	@Override
	public AllMemberDTO getInfo(String id) {

		return dao.getInfo(id);
	}

}
