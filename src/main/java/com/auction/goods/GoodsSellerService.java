package com.auction.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 상품 판매자 Service 클래스
 * @author 김석현
 *
 */
@Service
public class GoodsSellerService implements  IGoodsSeller {

	@Autowired
	private GoodSellerDAO dao;
	
	/**
	 * 상품의 대분류 리스트를 반환하는 메소드
	 * @return 상품의 대분류 리스트
	 */
	@Override
	public List<GoodsBigCategoryDTO> getBigCategoryList() {
		return dao.getBigCategoryList();
	}

	/**
	 * 대분류 상품 번호를 넘기면 상품소분류 리스트를 반환하는 메소드
	 * @param bseq 대분류 상품 번호
	 * @return 상품 소분류 리스트
	 */
	@Override
	public List<GoodsSmallCategoryDTO> Getsmallcategory(String bseq) {
		System.out.println(bseq);
		return dao.Getsmallcategory(bseq);
	}

	/**
	 * 상품 등록 메소드
	 * @param dto 상품 dto
	 * @return 성공유무
	 */
	@Override
	public void addsellerok(AuctionGoodsDTO dto) {
		
		dao.addsellerok(dto);
	}

	/**
	 * 상품 대분류 번호를 넘기면 해당 상품소분류 리스트를 반환하는 메소드
	 * @param bigcategoryseq 상품 대분류 번호
	 * @return 상품소분류 리스트
	 */
	@Override
	public List<GoodsSmallCategoryDTO> getSmallList(String bigcategoryseq) {
		return dao.getSmallList(bigcategoryseq);
	}

	/**
	 * 최근 등록한 상품 번호를 반환하는 메소드
	 * @return 최근 등록한 상품 번호
	 */
	@Override
	public String getMaxSeq() {
		// TODO Auto-generated method stub
		return dao.getMaxSeq();
	}
	
	
}
