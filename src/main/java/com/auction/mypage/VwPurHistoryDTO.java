package com.auction.mypage;

/**
 * 구매내역 관련 정보 DTO 클래스
 * @author 한종균
 *
 */
public class VwPurHistoryDTO {
	private String seq; //경매상품번호
	private String payDate;
	private String imageName; //이미지 파일명
	private String goodname;
	private String biddingPrice;
	private String esStatus;
	private String rpStatus;
	private String rfStatus;
	private String memberseq;
	private String isPayed;
	private String shipnum; //운송번호
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getBiddingPrice() {
		return biddingPrice;
	}
	public void setBiddingPrice(String biddingPrice) {
		this.biddingPrice = biddingPrice;
	}
	public String getEsStatus() {
		return esStatus;
	}
	public void setEsStatus(String esStatus) {
		this.esStatus = esStatus;
	}
	public String getRpStatus() {
		return rpStatus;
	}
	public void setRpStatus(String rpStatus) {
		this.rpStatus = rpStatus;
	}
	public String getRfStatus() {
		return rfStatus;
	}
	public void setRfStatus(String rfStatus) {
		this.rfStatus = rfStatus;
	}
	public String getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(String memberseq) {
		this.memberseq = memberseq;
	}
	public String getIsPayed() {
		return isPayed;
	}
	public void setIsPayed(String isPayed) {
		this.isPayed = isPayed;
	}
	public String getShipnum() {
		return shipnum;
	}
	public void setShipnum(String shipnum) {
		this.shipnum = shipnum;
	}
	@Override
	public String toString() {
		return "VwPurHistoryDTO [seq=" + seq + ", payDate=" + payDate + ", imageName=" + imageName + ", goodname="
				+ goodname + ", biddingPrice=" + biddingPrice + ", esStatus=" + esStatus + ", rpStatus=" + rpStatus
				+ ", rfStatus=" + rfStatus + ", memberseq=" + memberseq + ", isPayed=" + isPayed + ", shipnum="
				+ shipnum + "]";
	}
	
	
	
	
	
	
	
	
}
