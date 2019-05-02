package com.auction.goods;

public class WinningBidPayDTO {
	private String goodname;
	private String detail;
	private String status;
	private String biddingprice;
	private String finalbiddingprice;
	private String image;
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBiddingprice() {
		return biddingprice;
	}
	public void setBiddingprice(String biddingprice) {
		this.biddingprice = biddingprice;
	}
	public String getFinalbiddingprice() {
		return finalbiddingprice;
	}
	public void setFinalbiddingprice(String finalbiddingprice) {
		this.finalbiddingprice = finalbiddingprice;
	}
	
	
}
