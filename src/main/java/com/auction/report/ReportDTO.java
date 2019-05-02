package com.auction.report;

public class ReportDTO {
	
	private String seq;
	private String memberseq;
	private String auctionseq;
	private String reportcategoryseq;
	private String report;
	private String regdate;
	private String status;
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
	public String getAuctionseq() {
		return auctionseq;
	}
	public void setAuctionseq(String auctionseq) {
		this.auctionseq = auctionseq;
	}
	public String getReportcategoryseq() {
		return reportcategoryseq;
	}
	public void setReportcategoryseq(String reportcategoryseq) {
		this.reportcategoryseq = reportcategoryseq;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReportDTO [seq=" + seq + ", memberseq=" + memberseq + ", auctionseq=" + auctionseq
				+ ", reportcategoryseq=" + reportcategoryseq + ", report=" + report + ", regdate=" + regdate
				+ ", status=" + status + "]";
	}
	
	

}
