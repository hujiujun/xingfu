package com.xf.xingfu.client.service;

import com.xf.xingfu.client.model.Client;

/**
 * 客户业务逻辑方法接口
 * @author Administrator
 *
 */
public interface ClientService {

	/**
	 *    添加客户
	 * @param client
	 *    添加信息
	 */
	void addClient(Client client);
	
	/**
	 *   修改客户
	 * @param client
	 *   客户信息
	 */
	void upClient(Client client);
	
	/**
	 * 查询客户
	 * @param client
	 * 客户信息
	 */
	void selectClient(Client client);
}
