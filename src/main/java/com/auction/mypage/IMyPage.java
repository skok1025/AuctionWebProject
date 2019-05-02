package com.auction.mypage;

import java.util.List;

/**
 * 계정 관련 의존주입을 위한 인터페이스
 * @author 한종균
 */
public interface IMyPage {

	List<VwPurHistoryDTO> purlist(String memberseq); //구매내역

	List<VwBidHistoryDTO> bidlist(String memberseq); //응찰내역

}
