package com.auction.goods;

import java.util.List;

/**
 * Service interface입니다.
 * @author 정필립
 *
 */
public interface IWinningBidPay {

	List<WinningBidPayDTO> winning(String seq);

}
