package com.zlwon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 物性报价单消息类
 * @author yuand
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DealerdQuotationMessage {

	private  Integer  id;//物性报价单id
	
	private  Integer  type;//1添加,2删除
}
