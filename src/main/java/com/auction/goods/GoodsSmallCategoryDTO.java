package com.auction.goods;

public class GoodsSmallCategoryDTO {
	
	private String seq;
	private String bigcategoryseq;
	private String category;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getBigcategoryseq() {
		return bigcategoryseq;
	}
	public void setBigcategoryseq(String bigcategoryseq) {
		this.bigcategoryseq = bigcategoryseq;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "GoodsSmallCategoryDTO [seq=" + seq + ", bigcategoryseq=" + bigcategoryseq + ", category=" + category
				+ "]";
	}
	
	
	
	
	
	
	

}
