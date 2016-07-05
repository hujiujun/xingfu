package com.xf.xingfu.account.service;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Store;

/**
 * 账号业务逻辑方法接口
 * @author Administrator
 *
 */
public interface AccountService {

	/**
	 * 
	 * @param name 账号
	 * @param password 密码
	 * @param level 等级
	 * @return
	 */
	Account login(String name, String password,int level);
	
	/**
	 * 编辑账户信息
	 * 
	 * @param account
	 *            账户信息
	 */
	void editAccount(Account account);
	
	/**
	 * 创建账号
	 * 
	 * @param account
	 *            新的账号信息
	 */
	void createAccount(Account account);
	
	/**
	 * 修改密码
	 * @param account 
	 *         修改密码
	 */
	void updatepwd(String password,int id);
	
	/**
	 * 查询账户
	 * @param account
	 *     账号信息
	 */
	void selectAccount(Account account);
	
	void addStore(Store store);
}
