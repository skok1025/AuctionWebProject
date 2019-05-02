package com.auction.statistics;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 관리자 통계관련 디비작업 DAO 클래스
 * @author 우성환
 *
 */
@Repository
public class AdminDAO {
	
	@Autowired 
	private SqlSessionTemplate template;

	/**
	 * 상품의 대분류 카테고리 리스트를 반환하는 메소드
	 * @return 상품의 대분류 카테고리 리스트
	 */
	public List<String> getBigCategory() {
		return template.selectList("admin.getBigCategory");
	}

	/**
	 * 구매자,판매자의 주소 및 전화번호 등의 정보를 가져오는 메소드
	 * @param seq 상품의 번호
	 * @return 특정상품의 구매자, 판매자에 대한 정보
	 */
	public BidDTO getBidData(String seq) {
		return template.selectOne("admin.getBidData",seq);
	}
	
	
	
}
