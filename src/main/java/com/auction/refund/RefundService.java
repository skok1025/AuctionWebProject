package com.auction.refund;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 환불 관련 Service 클래스
 * @author 한종균
 *
 */
@Service
public class RefundService implements IRefund {

	/**
	 * 환불 DAO로 이동
	 */
	@Autowired
	private RefundDAO dao;

	/**
	 * DAO에 환불 카테고리 리스트를 불러오는 메소드
	 */
	@Override
	public List<RefundCategoryDTO> rfcategory() {
		
		return dao.rfcategory();
	}

	/**
	 * DAO에 환불처리를 하는 메소드
	 */
	@Override
	public int refundaddok(RefundDTO dto) {
		
		return dao.refundaddok(dto);
	}

	/**
	 * DAO에 환불제재 내역을 불러오는 메소드
	 */
	@Override
	public List<VwRefundDTO> refundlist(String sellerseq) {
		
		return dao.refundlist(sellerseq);
	}

	
}
