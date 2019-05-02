package com.auction.mypage;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 계정 관련 DAO 클래스
 * @author 한종균
 *
 */
@Repository
public class MyPageDAO {

	@Autowired
	private SqlSessionTemplate template;

	/**
	 * 회원번호를 넘겨받아 해당 회원의 구매내역 리스트를 반환하는 메소드
	 * @param memberseq (회원번호)
	 * @return 구매내역 리스트
	 */
	public List<VwPurHistoryDTO> purlist(String memberseq) {
		
		return template.selectList("mypage.history",memberseq);
	}

	/**
	 * 회원번호를 넘겨받아 해당 회원의 응찰내역 리스트를 반환하는 메소드
	 * @param memberseq (회원번호)
	 * @return 응찰내역 리스트
	 */
	public List<VwBidHistoryDTO> bidlist(String memberseq) {
		
		return template.selectList("mypage.bidhistory",memberseq) ;
	}
}
