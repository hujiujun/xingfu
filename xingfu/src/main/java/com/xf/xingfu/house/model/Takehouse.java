package com.xf.xingfu.house.model;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.client.model.Client;

/**
 * 看房记录表 定义属性 GET SET方法
 * @author Administrator
 *
 */
public class Takehouse {
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * account 业务员
	 */
	private Account account;
	/**
	 * client 客户
	 */
	private Client client;
	/**
	 * house 房子
	 */
	private House house;
	/**
	 * time 时间
	 */
	private String time;
	/**
	 * result 结果
	 */
	private int result;
	/**
	 * remark 备注
	 */
	private String remark;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}
	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
