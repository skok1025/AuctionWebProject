package com.auction.goods;

import java.util.List;

/**
 * 상품 판매자 관련 의존주입을 위한 인터페이스
 * @author 김석현
 *
 */
public interface IGoodsSeller {

	List<GoodsBigCategoryDTO> getBigCategoryList();

	List<GoodsSmallCategoryDTO> Getsmallcategory(String bseq);

	void addsellerok(AuctionGoodsDTO dto);

	List<GoodsSmallCategoryDTO> getSmallList(String bigcategoryseq);

	String getMaxSeq();

}
