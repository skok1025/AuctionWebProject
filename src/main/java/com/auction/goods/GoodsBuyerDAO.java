package com.auction.goods;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auction.account.MemberDTO;

/**
 * 상품 구매자에 대한 디비 작업 관련 DAO 클래스
 * @author 김석현
 *
 */
@Repository
public class GoodsBuyerDAO {
	
	
	@Autowired
	private SqlSessionTemplate template;

	/**
	 * 상품번호(seq)를 넘기면 해당 상품의 상세정보를 담은 dto 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 상세정보
	 */
	public AuctionInfoDTO get(String seq) {
		return template.selectOne("goodbuyer.get", seq);
	}

	/**
	 * 상품번호(seq)를 넘기면 상품의 메인이미지명을 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 메인 이미지명
	 */
	public String getMainImg(String seq) {
		return template.selectOne("goodbuyer.getmainimg", seq);
	}

	/**
	 * 상품번호(seq)를 넘기면 상품의 서브이미지명 리스트를 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 서브 이미지명 리스트
	 */
	public List<String> getSubimgs(String seq) {
		return template.selectList("goodbuyer.getsubimgs",seq);
	}

	/**
	 * 상품번호(seq) 를 넘기면 상품의 남은 시간(단위: 초) 로 반환하는 메소드
	 * @param seq 상품번호
	 * @return 해당 상품의 경매남은 시간(단위: 초)
	 */
	public int getremain(String seq) {
		return template.selectOne("goodbuyer.getremain", seq);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품 (0 or 1) 여부를 알려주는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 관심상품 여부 (0 or 1)
	 */
	public int isheart(HashMap<String, String> map) {
		return template.selectOne("goodbuyer.isheart", map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품으로 등록하는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 등록성공 여부
	 */
	public int addheart(HashMap<String, String> map) {
		return template.insert("goodbuyer.addheart",map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 관심상품에서 삭제하는 메소드
	 * @param map 회원번호, 상품번호를 담은 HashMap
	 * @return 삭제성공 여부
	 */
	public int delheart(HashMap<String, String> map) {
		return template.delete("goodbuyer.delheart", map);
	}

	/**
	 * 판매자의 번호를 넘기면 판매자의 다른 상품리스트를 반환해주는 메소드
	 * @param sellerseq 판매자 번호
	 * @return 판매자의 다른 상품리스트
	 */
	public List<AuctionInfoDTO> getothergoodlist(String sellerseq) {
		return template.selectList("goodbuyer.getothergoodlist", sellerseq);
	}

	/**
	 * 상품소분류 번호를 넘기면 상품소분류 리스트를 반환하는 메소드
	 * @param smallcategoryseq 상품소분류 번호
	 * @return 상품소분류에 맞는 상품 DTO 리스트 
	 */
	public List<AuctionInfoDTO> getsamegoodlist(String smallcategoryseq) {
		return template.selectList("goodbuyer.getsamegoodlist", smallcategoryseq);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 나의 상품 입찰가를 반환하는 메소드
	 * @param map 상품번호, 로그인한 회원번호를 담은 HashMap
	 * @return 해당상품에 대한 회원의 상품 입찰가
	 */
	public String getMyBidPrice(HashMap<String, String> map) {
		return template.selectOne("goodbuyer.getmybidprice", map);
	}

	/**
	 * 상품번호, 로그인한 회원번호를 담은 map을 넘기면 응찰가를 증가시키는 메소드
	 * @param map 상품번호, 로그인한 회원번호를 담은 HashMap
	 */
	public void bidupdate(HashMap<String, String> map) {
		template.insert("goodbuyer.bidupdate", map);
	}

	/**
	 * 회원번호를 넘기면 해당 회원의 정보 DTO를 반환하는 메소드
	 * @param memberseq 회원번호
	 * @return 회원정보 DTO
	 */
	public MemberDTO getMemberDTO(String memberseq) {
		return template.selectOne("goodbuyer.getmemberdto", memberseq);
	}

	/**
	 * 상품번호를 넘기면 상품의 DTO를 반환하는 메소드
	 * @param seq 상품번호
	 * @return 상품 DTO
	 */
	public AuctionGoodsDTO getAuctionGoodsDTO(String seq) {
		return template.selectOne("goodbuyer.getAuctionGoodsDTO", seq);
	}

	/**
	 * 경매상품 번호를 넘기면 판매자의 전화번호를 반환하는 메소드
	 * @param auctionseq 경매상품번호
	 * @return 판매자의 전화번호
	 */
	public String getSellerTel(String auctionseq) {
		return template.selectOne("goodbuyer.getSellerTel",auctionseq);
	}

	

}
