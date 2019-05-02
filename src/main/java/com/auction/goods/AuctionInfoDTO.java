package com.auction.goods;


/**
 * vwauctioninfo 의 dto
 * @author 김석현
 *
 */
public class AuctionInfoDTO {
	private String seq; // 경매 상품 번호
	private String sellerseq; // 판매자 seq
	private String title;
	private String goodname;
	private String detail;
	private String brand;
	private String startprice;
	private String regtime;
	private String deadline;
	private String instantprice;
	private String askingprice;
	private String goodssize;
	private String nowprice;
	private String sellername;
	private String selleremail;
	private String bigcategory;
	private String smallcategory;
	private String smallcategoryseq; // 상품 소분류 seq
	private String mainimg;
	
	public String getMainimg() {
		return mainimg;
	}
	public void setMainimg(String mainimg) {
		this.mainimg = mainimg;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getSellerseq() {
		return sellerseq;
	}
	public void setSellerseq(String sellerseq) {
		this.sellerseq = sellerseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStartprice() {
		return startprice;
	}
	public void setStartprice(String startprice) {
		this.startprice = startprice;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getInstantprice() {
		return instantprice;
	}
	public void setInstantprice(String instantprice) {
		this.instantprice = instantprice;
	}
	public String getAskingprice() {
		return askingprice;
	}
	public void setAskingprice(String askingprice) {
		this.askingprice = askingprice;
	}
	public String getGoodssize() {
		return goodssize;
	}
	public void setGoodssize(String goodssize) {
		this.goodssize = goodssize;
	}
	public String getNowprice() {
		return nowprice;
	}
	public void setNowprice(String nowprice) {
		this.nowprice = nowprice;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSelleremail() {
		return selleremail;
	}
	public void setSelleremail(String selleremail) {
		this.selleremail = selleremail;
	}
	public String getBigcategory() {
		return bigcategory;
	}
	public void setBigcategory(String bigcategory) {
		this.bigcategory = bigcategory;
	}
	public String getSmallcategory() {
		return smallcategory;
	}
	public void setSmallcategory(String smallcategory) {
		this.smallcategory = smallcategory;
	}
	public String getSmallcategoryseq() {
		return smallcategoryseq;
	}
	public void setSmallcategoryseq(String smallcategoryseq) {
		this.smallcategoryseq = smallcategoryseq;
	}
	@Override
	public String toString() {
		return "AuctionInfoDTO [seq=" + seq + ", sellerseq=" + sellerseq + ", title=" + title + ", goodname=" + goodname
				+ ", detail=" + detail + ", brand=" + brand + ", startprice=" + startprice + ", regtime=" + regtime
				+ ", deadline=" + deadline + ", instantprice=" + instantprice + ", askingprice=" + askingprice
				+ ", goodssize=" + goodssize + ", nowprice=" + nowprice + ", sellername=" + sellername
				+ ", selleremail=" + selleremail + ", bigcategory=" + bigcategory + ", smallcategory=" + smallcategory
				+ ", smallcategoryseq=" + smallcategoryseq + "]";
	}
	
	
	
}
