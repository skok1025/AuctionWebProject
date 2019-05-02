package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auction.main.SearchDTO;

/**
 * 메인화면의 상품 리스트를 보여주는 디비 처리를 담당하는 클래스
 * @author 이희규
 *
 */
@Repository
public class ListDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	/**
	 * 상품 대분류에 따른 상품 정보를 가져오는 메소드
	 * @return 상품 대분류 리스트
	 */
	public List<GoodsBigCategoryDTO> getBigCategory() {

		return template.selectList("goods.bigCategory");
	}

	/**
	 * 상품 조회시 로그를 추가하는 메소드
	 * @param seq 상품번호
	 * @return __
	 */
	public List<AuctionGoodsDTO> getCategoryGoodsLog(String seq) {

		return template.selectList("goods.CategoryGoodsLog",seq);
	}

	/**
	 * 실시간 상품 정보를 가져오는 메소드
	 * @return 실시간 상품 리스트
	 */
	public List<AuctionGoodsDTO> realGoodsList() {

		return template.selectList("goods.realGoodsList");
	}

	/**
	 * 로그인한 계정의 관심상품 정보를 가져오는 메소드
	 * @param seq 회원 번호
	 * @return 회원의 관심상품 리스트
	 */
	public List<AuctionGoodsDTO> interestList(String seq) {

		return template.selectList("goods.interestList", seq);
	}

	/**
	 * 인기검색어 정보를 가져오는 메소드
	 * @return 인기검색어 정보 리스트
	 */
	public List<SearchDTO> searchList() {

		return template.selectList("goods.searchList");
	}

	/**
	 * 해당 검색어로부터 해당하는 상품 리스트를 반환해주는 메소드
	 * @param search 검색어
	 * @return 해당 검색어에 해당하는 상품 리스트
	 */
	public List<AuctionGoodsDTO> searchList(String search) {

		return template.selectList("goods.searchGoods", search);
	}


	/**
	 * 검색을 위한 메소드 (회원번호, 검색어 넘김)
	 * @param map 회원번호,검색어 담은  HashMap
	 */
	public void search(HashMap<String, String> map) {
		
		template.insert("goods.searchWord", map);
	}

	/**
	 * 소분류 카테고리번호를 넘겨주면 소분류에 해당하는 상품리스트를 반환하는 메소드
	 * @param smallCategorySeq 소분류 번호
	 * @return 소분류에 해당하는 상품리스트
	 */
	public List<AuctionGoodsDTO> getCategoryGoods(String smallCategorySeq) {
		
		

		return template.selectList("goods.getCategoryGoods", smallCategorySeq);
	}

	/**
	 * 소분류 카테고리번호를 넘기면 해당 소분류명을 반환하는 메소드
	 * @param smallCategorySeq 소분류 카테고리 번호
	 * @return 해당 소분류명
	 */
	public String getSmallCategory(String smallCategorySeq) {

		return template.selectOne("goods.getSmallCategory", smallCategorySeq);
	}
	
	

}
