package com.xf.xingfu.client.model;

import java.sql.Date;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.house.model.House;

/**
 * 收藏实体类
 * @author Administrator
 *
 */
public class Zcollect {
	private int id;
	private Account account;//业务员
	private House house;//房源
	private Date date;//时间
	private int state;//状态
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
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
