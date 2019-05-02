package com.auction.main;

public class SearchDTO {
	
	private String seq;
	private String memberseq;
	private String search;
	
	//희규 추가
	private String rownum;
	private String mainimg;
	
	

	public String getMainimg() {
		return mainimg;
	}

	public void setMainimg(String mainimg) {
		this.mainimg = mainimg;
	}

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

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getRownum() {
		return rownum;
	}

	public void setRownum(String rownum) {
		this.rownum = rownum;
	}

	@Override
	public String toString() {
		return "SearchDTO [seq=" + seq + ", memberseq=" + memberseq + ", search=" + search + ", rownum=" + rownum + "]";
	}
	
	
	

}
