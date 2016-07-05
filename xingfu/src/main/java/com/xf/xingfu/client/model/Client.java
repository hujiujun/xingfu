package com.xf.xingfu.client.model;

import java.sql.Date;

import com.xf.xingfu.account.model.Account;

/**
 * 客户实体类
 * @author Administrator
 *
 */
public class Client {
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * name 客户名字
	 */
	private String name;
	/**
	 * phone 电话
	 */
	private String phone;
	/**
	 * urban 城区
	 */
	private String urban;
	/**
	 * uit 户型
	 */
	private int uit;

	/**
	 * price 价格
	 */
	private int price;
	/**
	 * faclity 设施
	 */
	private String faclity;
	/**
	 * state 状态
	 */
	private int state;
	/**
	 * account 业务员
	 */
	private int account;
	/**
	 * edttime 录入时间
	 */
	private String edttime;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the urban
	 */
	public String getUrban() {
		return urban;
	}
	/**
	 * @param urban the urban to set
	 */
	public void setUrban(String urban) {
		this.urban = urban;
	}
	
	
	/**
	 * @return the uit
	 */
	public int getUit() {
		return uit;
	}
	/**
	 * @param uit the uit to set
	 */
	public void setUit(int uit) {
		this.uit = uit;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the faclity
	 */
	public String getFaclity() {
		return faclity;
	}
	/**
	 * @param faclity the faclity to set
	 */
	public void setFaclity(String faclity) {
		this.faclity = faclity;
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

	/**
	 * @return the account
	 */
	public int getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(int account) {
		this.account = account;
	}
	/**
	 * @return the edttime
	 */
	public String getEdttime() {
		return edttime;
	}
	/**
	 * @param edttime the edttime to set
	 */
	public void setEdttime(String edttime) {
		this.edttime = edttime;
	}
	
	
	
} 
