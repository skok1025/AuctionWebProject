package com.auction.account;

/**
 * tblAdmin DTO
 * @author sist
 *
 */
public class AdminDTO {
	private String seq;
	private String id;
	private String pw;
	private String accountnum;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	@Override
	public String toString() {
		return "AdminDTO [seq=" + seq + ", id=" + id + ", pw=" + pw + ", accountnum=" + accountnum + "]";
	}
	
	

}
