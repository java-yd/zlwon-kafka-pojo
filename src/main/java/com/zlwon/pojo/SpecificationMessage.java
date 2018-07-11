package com.zlwon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 物性消息类
 * @author yuand
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpecificationMessage {

	private  Integer  id;//物性id
	
	private  Integer  type;//1添加(更新),2删除
}
