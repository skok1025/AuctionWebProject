package com.auction.account;

import java.util.HashMap;

public interface IAccount  {

	int login(HashMap<String, String> loginMap);

	AllMemberDTO getInfo(String id);

}
