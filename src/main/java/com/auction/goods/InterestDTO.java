package com.auction.goods;

public class InterestDTO {

	private String seq;
	private String auctionseq;
	private String memberseq;
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
	public String getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(String memberseq) {
		this.memberseq = memberseq;
	}
	@Override
	public String toString() {
		return "InterestDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", memberseq=" + memberseq + "]";
	}
	
	
}
