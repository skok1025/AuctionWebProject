package com.auction.goods;

/**
 * tblGoodsBigCategory DTO
 * @author 김석현
 *
 */
public class GoodsBigCategoryDTO {
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
		return "GoodsBigCategoryDTO [seq=" + seq + ", category=" + category + "]";
	}
	
	
	

}
