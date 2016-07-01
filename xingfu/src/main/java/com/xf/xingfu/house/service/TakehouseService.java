package com.xf.xingfu.house.service;

import com.xf.xingfu.house.model.Takehouse;

/**
 * 看房记录的业务逻辑实现方法
 * @author Administrator
 *
 */
public interface TakehouseService {

	/**
	 * 添加看房记录
	 * @param takehouse
	 *    看房信息
	 */
	void addTakehouse(Takehouse takehouse);
	
	/**
	 * 修改看房信息
	 * @param takehouse
	 *    看房信息
	 */
	void updateTakehouse(Takehouse takehouse);
	
	/**
	 * 查看看房信息
	 * @param takehouse
	 * 看房信息
	 */
	void selectTakehouse(Takehouse takehouse);
}
