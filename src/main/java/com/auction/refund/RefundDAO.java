package com.auction.refund;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * 환불 관련 DAO 클래스
 * @author 한종균
 *
 */
@Repository
public class RefundDAO {

	@Autowired
	private SqlSessionTemplate template;

	/**
	 * 환불 카테고리 리스트를 반환하는 메소드
	 * @return 환불 카테고리 리스트
	 */
	public List<RefundCategoryDTO> rfcategory() {
		
		return template.selectList("refund.category");
	}

	/**
	 * 환불 등록 처리를 하는 메소드
	 * @param dto 입력한 환불DTO
	 * @return 환불 처리 
	 */
	public int refundaddok(RefundDTO dto) {
		
		return template.insert("refund.addok",dto);
	}

	/**
	 * 환불제재 내역 리스트를 반환하는 메소드
	 * @param sellerseq 판매자번호
	 * @return 환불제재 내역 리스트
	 */
	public List<VwRefundDTO> refundlist(String sellerseq) {
		
		return template.selectList("refund.refundlist",sellerseq);
	}
}
