package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import com.auction.account.MemberDTO;

/**
 * 상품 구매자 관련 의존주입을 위한 인터페이스
 * @author 김석현
 *
 */
public interface IGoodsBuyer {

	AuctionInfoDTO get(String seq);

	String getMainImg(String seq);

	List<String> getSubimgs(String seq);

	int getremain(String seq);

	
	int isheart(HashMap<String, String> map);

	int addheart(HashMap<String, String> map);

	int delheart(HashMap<String, String> map);

	List<AuctionInfoDTO> getothergoodlist(String sellerseq);

	List<AuctionInfoDTO> getsamegoodlist(String smallcategoryseq);

	String getMyBidPrice(HashMap<String, String> map);

	void bidupdate(HashMap<String, String> map);

	MemberDTO getMemberDTO(String memberseq);

	AuctionGoodsDTO getAuctionGoodsDTO(String seq);

	/**
	 * 상품번호 (auctionseq) 를 넘기면 해당 상품의 판매자 휴대폰번호를 반환하는 메소드
	 * @param auctionseq 상품 번호
	 * @return 해당 상품의 판매자 전화번호
	 */
	String getSellerTel(String auctionseq);

	


}
