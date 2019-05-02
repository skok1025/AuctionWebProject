package com.auction.goods;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 상품 판매자 관련 디비 작업 DAO 클래스
 * @author 김석현
 *
 */
@Repository
public class GoodSellerDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	/**
	 * 상품의 대분류 리스트를 반환하는 메소드
	 * @return 상품의 대분류 리스트
	 */
	public List<GoodsBigCategoryDTO> getBigCategoryList() {
		return template.selectList("goodseller.getbigcategorylist");
	}

	/**
	 * 대분류 상품 번호를 넘기면 상품소분류 리스트를 반환하는 메소드
	 * @param bseq 대분류 상품 번호
	 * @return 상품 소분류 리스트
	 */
	public List<GoodsSmallCategoryDTO> Getsmallcategory(String bseq) {
		
		return template.selectList("goodseller.getsmallcategory",bseq);
	}

	/**
	 * 상품 등록 메소드
	 * @param dto 상품 dto
	 * @return 성공유무
	 */
	public void addsellerok(AuctionGoodsDTO dto) {
		
		System.out.println(template.insert("goodseller.addsellerok", dto)); 
		//System.out.println(template.insert("goodseller.addsellerok1",dto));
		//String now_auctionseq = template.selectOne("goodseller.getnowaseq");
		
		//System.out.println(template.insert("goodseller.addsellerok2",dto));
	}

	/**
	 * 상품 대분류 번호를 넘기면 해당 상품소분류 리스트를 반환하는 메소드
	 * @param bigcategoryseq 상품 대분류 번호
	 * @return 상품소분류 리스트
	 */
	public List<GoodsSmallCategoryDTO> getSmallList(String bigcategoryseq) {
		return template.selectList("goodseller.getSmallList", bigcategoryseq);
	}

	/**
	 * 최근 등록한 상품 번호를 반환하는 메소드
	 * @return 최근 등록한 상품 번호
	 */
	public String getMaxSeq() {
		return template.selectOne("goodseller.getMaxSeq");
	}

}
