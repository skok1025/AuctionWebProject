package com.auction.account;

public class AllMemberDTO {
	
	private String seq;
	private String email;
	private String name;
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
		return "AllMemberDTO [seq=" + seq + ", email=" + email + ", name=" + name + ", pw=" + pw + ", address="
				+ address + ", birth=" + birth + ", regdate=" + regdate + ", tel=" + tel + ", bonus=" + bonus + "]";
	}
	
	

}
