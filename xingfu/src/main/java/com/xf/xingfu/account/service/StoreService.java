package com.xf.xingfu.account.service;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Area;
import com.xf.xingfu.account.model.Store;

/**
 * 用于店铺的逻辑方法接口
 * @author Administrator
 *
 */
public interface StoreService {
      
	/**
	 * 添加店铺
	 * @param account 店长
	 * @param area   区域
	 */
	void addStore(Account account,Area area);
	
	/**
	 * 修改店铺信息
	 * @param store
	 *        店铺信息
	 */
	void upStore(Store store);
	
	/**
	 * 查询店铺信息
	 * @param store
	 *     店铺信息
	 */
	void selectStore(Store store);
	
}
