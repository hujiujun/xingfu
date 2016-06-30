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

	private int id;//编号
	private Account account;//业务员 fk
	private Client client;//客户 fk
	private House house;//房源 fk
	private int term;//租期
	private int price;//价格
	private Date date;//日期
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
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
