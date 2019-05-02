package com.auction.main;

public class SmslogDTO {
	private String seq;
	private String auctionseq;
	private String regdate;
	private String sms;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	@Override
	public String toString() {
		return "SmslogDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", regdate=" + regdate + ", sms=" + sms + "]";
	}
	
	

}
