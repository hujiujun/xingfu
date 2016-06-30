package com.xf.xingfu.house.model;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.client.model.Client;

/**
 * 看房记录表 定义属性 GET SET方法
 * @author Administrator
 *
 */
public class Takehouse {

	private int id;//编号
	private Account account;//业务员
	private Client client;//客户
	private House house;//房子
	private String time;//时间
	private int result;//结果
	private String remark;//备注
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
