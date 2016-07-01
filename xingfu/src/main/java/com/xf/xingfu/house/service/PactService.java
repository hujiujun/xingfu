package com.xf.xingfu.house.service;

import com.xf.xingfu.house.model.Pact;

/**
 * 合同业务逻辑的接口
 * @author Administrator
 *
 */
public interface PactService {

	/**
	 * 添加合同
	 * @param pact
	 *    合同信息
	 */
	void addPact(Pact pact);
	
	/**
	 * 修改合同
	 * @param pact
	 *     合同信息
	 */
	void updatePact(Pact pact);
	
	/**
	 * 查看合同
	 * @param pact
	 * 合同信息
	 */
	void selectPact(Pact pact);
}
