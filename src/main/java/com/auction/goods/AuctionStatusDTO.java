package com.auction.goods;

/**
 * tblAuctionStatus DTO
 * @author 김석현
 *
 */
public class AuctionStatusDTO {
	
	private String seq;
	private String status;
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AuctionStatusDTO [seq=" + seq + ", status=" + status + "]";
	}
	
	

}
