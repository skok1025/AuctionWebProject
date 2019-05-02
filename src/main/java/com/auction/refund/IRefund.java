package com.auction.refund;

import java.util.List;
/**
 * 환불 관련 의존주입을 위한 인터페이스
 * @author 한종균
 *
 */
public interface IRefund {

	List<RefundCategoryDTO> rfcategory();

	int refundaddok(RefundDTO dto);

	List<VwRefundDTO> refundlist(String sellerseq);

	

}
