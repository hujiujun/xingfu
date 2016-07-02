package com.xf.xingfu.house.model;

import java.sql.Date;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.client.model.Client;

/**
 * 合同表 定义属性 GET SET方法
 * @author Administrator
 *
 */
public class Pact {
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * account 业务员 fk
	 */
	private Account account;
	/**
	 * client 客户 fk
	 */
	private Client client;
	/**
	 * huose 房源 fk
	 */
	private House house;
	/**
	 * term 租期
	 */
	private int term;
	/**
	 * price 价格
	 */
	private int price;
	/**
	 * date 日期
	 */
	private Date date;
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
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}
	/**
	 * @param term the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
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
	
	
}
