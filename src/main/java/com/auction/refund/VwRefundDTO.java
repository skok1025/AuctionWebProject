package com.auction.refund;

/**
 * 환불 제재 내역 정보 DTO클래스
 * @author 한종균
 *
 */
public class VwRefundDTO {
	private String seq;
	private String sellerseq;
	private String goodname;
	private String detail;
	private String regdate;
	private String email;
	private String name;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "VwRefundDTO [seq=" + seq + ", sellerseq=" + sellerseq + ", goodname=" + goodname + ", detail=" + detail
				+ ", regdate=" + regdate + ", email=" + email + ", name=" + name + "]";
	}
	
	
}
