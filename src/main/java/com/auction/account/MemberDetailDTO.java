package com.auction.account;

public class MemberDetailDTO {
	
	private String seq;
	private String memberseq;
	private String pw;
	private String address;
	private String birth;
	private String regdate;
	private String tel;
	private String bonus;
	
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "MemberDetail [seq=" + seq + ", memberseq=" + memberseq + ", pw=" + pw + ", address=" + address
				+ ", birth=" + birth + ", regdate=" + regdate + ", tel=" + tel + ", bonus=" + bonus + "]";
	}
	
	

}
