package com.auction.goods;

/**
 * tblAuctionGoodsLog DTO
 * @author 김석현
 *
 */
public class AuctiongoodslogDTO {

	private String seq; 
	private String auctionseq;
	private String memberseq;
	private String regdate;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "auctiongoodslogDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", memberseq=" + memberseq
				+ ", regdate=" + regdate + "]";
	}
	
	
}
