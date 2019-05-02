package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.main.SearchDTO;

/**
 * GoodsController에 대한 Service 클래스
 * @author 이희규
 *
 */
@Service
public class ListService implements IList{

	@Autowired
	private ListDAO dao;

	/**
	 * 상품 대분류에 따른 상품 정보를 가져오는 메소드
	 */
	@Override
	public List<GoodsBigCategoryDTO> getBigCategory() {

		return dao.getBigCategory();
	}

	/**
	 * 상품 조회시 로그를 추가하는 메소드
	 */
	@Override
	public List<AuctionGoodsDTO> getCategoryGoodsLog(String seq) {
		
		

		return dao.getCategoryGoodsLog(seq);
	}

	/**
	 * 실시간 상품 정보를 가져오는 메소드
	 */
	@Override
	public List<AuctionGoodsDTO> realGoodsList() {
		
		List<AuctionGoodsDTO> list= dao.realGoodsList();
		
		//1.상품명 자르기
		//2.날짜 자르기
		
		//1.
		for(AuctionGoodsDTO dto : list) {
			if (dto.getGoodname().length() > 15) {
				String goodName =dto.getGoodname().substring(0, 15);
				goodName += ".....";
				dto.setGoodname(goodName);
			}
			
		//2.
			String date = dto.getDeadline();
			int index = date.lastIndexOf(":");
			date = date.substring(0,index);
			dto.setDeadline(date);
			
		}//for

		return list;
	}

	/**
	 * 로그인한 계정의 관심상품 정보를 가져오는 메소드
	 */
	@Override
	public List<AuctionGoodsDTO> interestList(String seq) {

		return dao.interestList(seq);
	}

	/**
	 * 인기검색어 정보를 가져오는 메소드
	 */
	@Override
	public List<SearchDTO> searchList() {

		return dao.searchList();
	}


	/**
	 * 해당 검색어로부터 해당하는 상품 리스트를 반환해주는 메소드
	 */
	@Override
	public List<AuctionGoodsDTO> searchList(String search) {

		return dao.searchList(search);
	}

	/**
	 * 소분류 카테고리번호를 넘겨주면 소분류에 해당하는 상품리스트를 반환하는 메소드
	 */
	@Override
	public List<AuctionGoodsDTO> getCategoryGoods(String smallCategorySeq) {

		return dao.getCategoryGoods(smallCategorySeq);
	}

	/**
	 * 소분류 카테고리번호를 넘기면 해당 소분류명을 반환하는 메소드
	 */
	@Override
	public String getSmallCategory(String smallCategorySeq) {

		return dao.getSmallCategory(smallCategorySeq);
	}




	
}







