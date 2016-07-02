package com.xf.xingfu.account.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.xf.xingfu.account.dao.AccountDao;
import com.xf.xingfu.account.dao.AccountMapper;
import com.xf.xingfu.account.model.Account;

/**
 * 实现账号业务逻辑方法接口
 * @author Administrator
 *
 */
public class AccountServiceImpl implements AccountService {
    
	@Autowired
	private AccountMapper accountMapper;
	
	
	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	@Override
	public Account login(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatepwd(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

}
