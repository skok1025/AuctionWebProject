package com.auction.statistics;

import java.util.List;

/**
 * 관리자 통계관련 의존주입을 위한 인터페이스
 * @author 우성환
 *
 */
public interface IStatistics {

	List<String> getBigCategory();

	BidDTO getBidData(String seq);

}
