package com.auction.statistics;

public class BidDTO {
	//어드민 용 BidDTO임
	private String seq;
	private String buyerSeq;
	private String buyerName;
	private String buyerAddress;
	private String buyerTel;
	private String sellerSeq;
	private String sellerName;
	private String sellerAddress;
	private String sellerTel;
	private String price;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getBuyerSeq() {
		return buyerSeq;
	}
	public void setBuyerSeq(String buyerSeq) {
		this.buyerSeq = buyerSeq;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerAddress() {
		return buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerTel() {
		return buyerTel;
	}
	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}
	public String getSellerSeq() {
		return sellerSeq;
	}
	public void setSellerSeq(String sellerSeq) {
		this.sellerSeq = sellerSeq;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerTel() {
		return sellerTel;
	}
	public void setSellerTel(String sellerTel) {
		this.sellerTel = sellerTel;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BidDTO [seq=" + seq + ", buyerSeq=" + buyerSeq + ", buyerName=" + buyerName + ", buyerAddress="
				+ buyerAddress + ", buyerTel=" + buyerTel + ", sellerSeq=" + sellerSeq + ", sellerName=" + sellerName
				+ ", sellerAddress=" + sellerAddress + ", sellerTel=" + sellerTel + ", price=" + price + "]";
	}
}
