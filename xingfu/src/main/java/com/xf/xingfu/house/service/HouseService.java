package com.xf.xingfu.house.service;

import com.xf.xingfu.house.model.House;

/**
 * 房源业务流程控制的接口
 * @author Administrator
 *
 */
public interface HouseService {

	/**
	 * 添加房源
	 * @param house
	 * 房源信息
	 */
	void addHous(House house);
	
	/**
	 * 修改房源信息
	 * @param house
	 * 	 房源信息
	 */
	void updateHous(House house);
	
	/**
	 * 查询房源
	 * @param house
	 *    房源信息 
	 */
	void selectHous(House house);
}
