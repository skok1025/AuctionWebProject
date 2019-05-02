package com.auction.refund;

/**
 * 환불 정보 DTO 클래스
 * @author 한종균
 *
 */
public class RefundDTO {
	private String seq;
	private String memberseq;
	private String auctionseq;
	private String refundseq;
	private String detail;
	private String regdate;
	private String status;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(String memberseq) {
		this.memberseq = memberseq;
	}
	public String getAuctionseq() {
		return auctionseq;
	}
	public void setAuctionseq(String auctionseq) {
		this.auctionseq = auctionseq;
	}
	public String getRefundseq() {
		return refundseq;
	}
	public void setRefundseq(String refundseq) {
		this.refundseq = refundseq;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
