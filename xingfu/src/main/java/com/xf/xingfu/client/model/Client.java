package com.xf.xingfu.client.model;

import java.sql.Date;

import com.xf.xingfu.account.model.Account;

/**
 * 客户实体类
 * @author Administrator
 *
 */
public class Client {

	private int id;
	private String name;
	private String phone;//电话
	private String urban;//城区
	private String uit;//户型
	private int floor;//楼层
	private int price;//价格
	private String faclity;//设施
	private int state;//状态
	private Account account;//业务员
	private Date edttime;//录入时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrban() {
		return urban;
	}
	public void setUrban(String urban) {
		this.urban = urban;
	}
	public String getUit() {
		return uit;
	}
	public void setUit(String uit) {
		this.uit = uit;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFaclity() {
		return faclity;
	}
	public void setFaclity(String faclity) {
		this.faclity = faclity;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Date getEdttime() {
		return edttime;
	}
	public void setEdttime(Date edttime) {
		this.edttime = edttime;
	}
	
} 
