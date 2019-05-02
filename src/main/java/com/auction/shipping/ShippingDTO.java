package com.auction.shipping;

public class ShippingDTO {
	private String seq;
	private String auctionseq;
	private String shipnum;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getAuctionseq() {
		return auctionseq;
	}
	public void setAuctionseq(String auctionseq) {
		this.auctionseq = auctionseq;
	}
	public String getShipnum() {
		return shipnum;
	}
	public void setShipnum(String shipnum) {
		this.shipnum = shipnum;
	}
	@Override
	public String toString() {
		return "ShippingDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", shipnum=" + shipnum + "]";
	}
	
	
}
