package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.account.MemberDTO;

/**
 * 상품 구매자에 대한 Service 클래스
 * @author 김석현
 *
 */
@Service
public class GoodsBuyerService implements IGoodsBuyer {

	
	@Autowired
	private GoodsBuyerDAO dao;
	
	/**
	 * 상품번호(seq)를 넘기면 해당 상품의 상세정보를 담은 dto 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 상세정보
	 */
	@Override
	public AuctionInfoDTO get(String seq) {
		AuctionInfoDTO dto = dao.get(seq);
		dto.setDeadline(dto.getDeadline().substring(0, dto.getDeadline().lastIndexOf(":")));
		return dto;
	}

	/**
	 * 상품번호(seq)를 넘기면 상품의 메인이미지명을 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 메인 이미지명
	 */
	@Override
	public String getMainImg(String seq) {
		return dao.getMainImg(seq);
	}

	/**
	 * 상품번호(seq)를 넘기면 상품의 서브이미지명 리스트를 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 서브 이미지명 리스트
	 */
	@Override
	public List<String> getSubimgs(String seq) {
		return dao.getSubimgs(seq);
	}

	/**
	 * 상품번호(seq) 를 넘기면 상품의 남은 시간(단위: 초) 로 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 경매남은 시간(단위: 초)
	 */
	@Override
	public int getremain(String seq) {
		return dao.getremain(seq);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품 (0 or 1) 여부를 알려주는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 관심상품 여부 (0 or 1)
	 */
	@Override
	public int isheart(HashMap<String, String> map) {
		return dao.isheart(map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품으로 등록하는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 등록성공 여부
	 */
	@Override
	public int addheart(HashMap<String, String> map) {
		return dao.addheart(map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품에서 삭제하는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 삭제성공 여부
	 */
	@Override
	public int delheart(HashMap<String, String> map) {
		return dao.delheart(map);
	}

	/**
	 * 판매자의 번호를 넘기면 판매자의 다른 상품리스트를 반환해주는 메소드
	 * @param sellerseq 판매자 번호
	 * @return 판매자의 다른 상품리스트
	 */
	@Override
	public List<AuctionInfoDTO> getothergoodlist(String sellerseq) {
		return dao.getothergoodlist(sellerseq);
	}

	/**
	 * 상품소분류 번호를 넘기면 상품소분류 리스트를 반환하는 메소드
	 * @param smallcategoryseq 상품소분류 번호
	 * @return 상품소분류에 맞는 상품 DTO 리스트 
	 */
	@Override
	public List<AuctionInfoDTO> getsamegoodlist(String smallcategoryseq) {
		return dao.getsamegoodlist(smallcategoryseq);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 나의 상품 입찰가를 반환하는 메소드
	 * @param map 상품번호, 로그인한 회원번호를 담은 HashMap
	 * @return 해당상품에 대한 회원의 상품 입찰가
	 */
	@Override
	public String getMyBidPrice(HashMap<String, String> map) {
		return dao.getMyBidPrice(map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 응찰가를 증가시키는 메소드
	 * @param map 상품번호, 로그인한 회원번호를 담은 HashMap
	 */
	@Override
	public void bidupdate(HashMap<String, String> map) {
		dao.bidupdate(map);
	}

	/**
	 * 회원번호를 넘기면 해당 회원의 정보 DTO를 반환하는 메소드
	 * @param memberseq 회원번호
	 * @return 회원정보 DTO
	 */
	@Override
	public MemberDTO getMemberDTO(String memberseq) {
		// TODO Auto-generated method stub
		return dao.getMemberDTO(memberseq);
	}

	/**
	 * 상품번호를 넘기면 상품의 DTO를 반환하는 메소드
	 * @param seq 상품번호
	 * @return 상품 DTO
	 */
	@Override
	public AuctionGoodsDTO getAuctionGoodsDTO(String seq) {
		return dao.getAuctionGoodsDTO(seq);
	}

	/**
	 * 경매상품 번호를 넘기면 판매자의 전화번호를 반환하는 메소드
	 * @param auctionseq 경매상품번호
	 * @return 판매자의 전화번호
	 */
	@Override
	public String getSellerTel(String auctionseq) {
		return dao.getSellerTel(auctionseq);
	}


	

	

	

}
