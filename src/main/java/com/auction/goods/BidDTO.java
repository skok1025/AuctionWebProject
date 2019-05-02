package com.auction.goods;

/**
 * tblBid DTO
 * @author 김석현
 *
 */
public class BidDTO {
	
	private String seq;
	private String auctionseq;
	private String memberseq;
	private String auctionstatusseq;
	private String biddate;
	private String biddingprice;
	private String ispayed;
	private String paydate;
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
	public String getAuctionstatusseq() {
		return auctionstatusseq;
	}
	public void setAuctionstatusseq(String auctionstatusseq) {
		this.auctionstatusseq = auctionstatusseq;
	}
	public String getBiddate() {
		return biddate;
	}
	public void setBiddate(String biddate) {
		this.biddate = biddate;
	}
	public String getBiddingprice() {
		return biddingprice;
	}
	public void setBiddingprice(String biddingprice) {
		this.biddingprice = biddingprice;
	}
	public String getIspayed() {
		return ispayed;
	}
	public void setIspayed(String ispayed) {
		this.ispayed = ispayed;
	}
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	@Override
	public String toString() {
		return "BidDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", memberseq=" + memberseq + ", auctionstatusseq="
				+ auctionstatusseq + ", biddate=" + biddate + ", biddingprice=" + biddingprice + ", ispayed=" + ispayed
				+ ", paydate=" + paydate + "]";
	}
	
	

}
