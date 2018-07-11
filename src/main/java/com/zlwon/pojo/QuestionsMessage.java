package com.zlwon.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 提问消息类
 * @author yuand
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuestionsMessage {

	private  Integer  id;//提问id
	
	private  Integer  infoClass;//1物性2案例
	
	private  Integer  type;//1添加,2删除
}
