package com.auction.refund;

/**
 * 환불 카테고리 관련 정보 DTO
 * @author 한종균
 *
 */
public class RefundCategoryDTO {
	private String seq;
	private String category;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "RefundCategoryDTO [seq=" + seq + ", category=" + category + "]";
	}
	
	
}
