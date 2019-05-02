package com.auction.statistics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 관리자 통계 관련 Service 클래스
 * @author 우성환
 *
 */
@Service
public class StatisticsService implements IStatistics{
	
	@Autowired
	private AdminDAO adminDao;

	
	/**
	 * 상품의 대분류 카테고리 리스트를 반환하는 메소드
	 * @return 상품의 대분류 카테고리 리스트
	 */
	@Override
	public List<String> getBigCategory() {
		return adminDao.getBigCategory();
	}

	/**
	 * 구매자,판매자의 주소 및 전화번호 등의 정보를 가져오는 메소드
	 * @param seq 상품의 번호
	 * @return 특정상품의 구매자, 판매자에 대한 정보
	 */
	@Override
	public BidDTO getBidData(String seq) {
		return adminDao.getBidData(seq);
	}
}
