package com.auction.goods;

/**
 * tblAuctionImage DTO
 * @author 김석현
 *
 */
public class AuctionImageDTO {

	private String seq;
	private String auctionseq;
	private String image;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "AuctionImageDTO [seq=" + seq + ", auctionseq=" + auctionseq + ", image=" + image + "]";
	}
	
	
}
