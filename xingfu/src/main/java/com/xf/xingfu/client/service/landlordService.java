package com.xf.xingfu.client.service;

import com.xf.xingfu.client.model.Landlord;

/**
 * 房东业务逻辑接口
 * @author Administrator
 *
 */
public interface landlordService {

    /**
     * 添加房东
     * @param landlord
     *   房东信息
     */
	void addlandlord(Landlord landlord);
	
	/**
	 * 修改房东信息
	 * @param landlord
	 *       房东信息
	 */
	void updatelandlord(Landlord landlord);
	
	/**
	 * 查询房东信息
	 * @param landlord
	 */
	void seletelandlord(Landlord landlord);
}
