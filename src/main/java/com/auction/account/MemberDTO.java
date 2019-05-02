package com.auction.account;

public class MemberDTO {
	
	private String seq;
	private String email;
	private String name;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
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
		return "MemberDTO [seq=" + seq + ", email=" + email + ", name=" + name + "]";
	}
	
	

}
