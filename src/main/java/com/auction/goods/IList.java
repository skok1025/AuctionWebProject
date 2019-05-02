package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import com.auction.main.SearchDTO;

/**
 * GoodsController 관련 의존주입을 위한 인터페이스
 * @author 이희규
 *
 */
public interface IList {

	
	List<GoodsBigCategoryDTO> getBigCategory();

	List<AuctionGoodsDTO> getCategoryGoodsLog(String seq);

	List<AuctionGoodsDTO> realGoodsList();

	List<AuctionGoodsDTO> interestList(String seq);

	List<SearchDTO> searchList();

	List<AuctionGoodsDTO> searchList(String search);

	List<AuctionGoodsDTO> getCategoryGoods(String smallCategorySeq);

	String getSmallCategory(String smallCategorySeq);


}
