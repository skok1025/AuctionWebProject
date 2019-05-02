package com.auction.mypage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 계정 관련 Service 클래스
 * @author 한종균
 *
 */
@Service
public class MyPageService implements IMyPage{

	/**
	 * 마이페이지 DAO로 이동
	 */
	@Autowired
	private MyPageDAO dao;

	
	/**
	 * 회원번호를 넘겨받아 DAO에 구매내역 리스트를 불러오는 메소드
	 */
	@Override
	public List<VwPurHistoryDTO> purlist(String memberseq) {
		
		return dao.purlist(memberseq);
	}

	/**
	 * 회원번호를 넘겨받아 DAO에 응찰내역 리스트를 불러오는 메소드
	 */
	@Override
	public List<VwBidHistoryDTO> bidlist(String memberseq) {
		
		return dao.bidlist(memberseq);
	}
	
	
	

}
