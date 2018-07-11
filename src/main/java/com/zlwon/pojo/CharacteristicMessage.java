package com.zlwon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 物性标签消息类
 * @author yuand
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CharacteristicMessage {

	private  Integer  id;//物性标签id
	
	private  Integer  type;//1添加,2删除
}
