package com.auction.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 낙찰 확인 Service
 * @author 정필립
 *
 */
@Service
public class WinningBidPay implements IWinningBidPay{

	@Autowired
	private WinningBidPayDAO dao;
	
	/**
	 * DB로 보내기
	 */
	@Override
	public List<WinningBidPayDTO> winning(String seq) {
		
		return dao.winning(seq);
	}

	
}
