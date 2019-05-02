package com.auction.goods;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 낙찰 정보 리스트 DB호출하기.
 * @author 정필립
 *
 */
@Repository
public class WinningBidPayDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	/**
	 * 낙찰 정보 리스트 가져오기
	 * @param seq 
	 * @return winningBid.xml의 쿼리문 호출
	 */
	public List<WinningBidPayDTO> winning(String seq) {
		
		return template.selectList("winningBid.list",seq);
	}

}
