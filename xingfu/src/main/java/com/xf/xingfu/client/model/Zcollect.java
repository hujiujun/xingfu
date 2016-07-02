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
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * account 业务员
	 */
	private Account account;
	/**
	 * house 房源
	 */
	private House house;//房源
	/**
	 * date 时间
	 */
	private Date date;//时间
	/**
	 * state 状态
	 */
	private int state;//状态
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	
	
}
