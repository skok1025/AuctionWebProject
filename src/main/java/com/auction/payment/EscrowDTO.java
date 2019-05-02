package com.auction.payment;

public class EscrowDTO {
	
	private String seq;
	private String auctionseq;
	private String status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EscrowDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", status=" + status + "]";
	}
	
	

}
