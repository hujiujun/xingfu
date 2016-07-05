package com.xf.xingfu.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xf.xingfu.account.dao.AccountMapper;
import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Store;

/**
 * 实现账号业务逻辑方法接口
 * @author Administrator
 *
 */
@Service(value = "accountService")
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
	public Account login(String name, String password,int level) {
	
		return accountMapper.login(name, password,level);
	}

	@Override
	public void editAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 修改密码
	 */
	@Override
	public void updatepwd(String password,int id) {
		
		accountMapper.uppwd(password, id);
		
	}

	@Override
	public void selectAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStore(Store store) {
		System.out.println(store.getName()+" "+
				store.getArea()+" "+store.getUrban()+" "+ 
				store.getBuinour()+" "+store.getAddress());
		accountMapper.addscore(store.getName(),
				store.getArea(), 
				store.getUrban(), 
				store.getBuinour(), 
				store.getAddress());
		
	}

}
