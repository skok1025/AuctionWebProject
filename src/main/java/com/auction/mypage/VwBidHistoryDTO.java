package com.auction.mypage;

/**
 * 응찰내역 관련 정보 DTO 클래스
 * @author 한종균
 *
 */
public class VwBidHistoryDTO {
	private String imageName;
	private String seq; //경매상품번호
	private String title;
	private String status;
	private String biddingPrice;
	private String bigPrice; //최종응찰가
	private String memberseq;
	
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBiddingPrice() {
		return biddingPrice;
	}
	public void setBiddingPrice(String biddingPrice) {
		this.biddingPrice = biddingPrice;
	}
	public String getBigPrice() {
		return bigPrice;
	}
	public void setBigPrice(String bigPrice) {
		this.bigPrice = bigPrice;
	}
	public String getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(String memberseq) {
		this.memberseq = memberseq;
	}
	@Override
	public String toString() {
		return "VwBidHistoryDTO [imageName=" + imageName + ", seq=" + seq + ", title=" + title + ", status=" + status
				+ ", biddingPrice=" + biddingPrice + ", bigPrice=" + bigPrice + ", memberseq=" + memberseq + "]";
	}
	
	
	
	
}
