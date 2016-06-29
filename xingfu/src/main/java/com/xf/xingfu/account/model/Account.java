package com.xf.xingfu.account.model;
/**
 * 用来定义账号的实体类
 * @author Administrator
 *
 */
public class Account {
     private int id;
     private String name;
     private String password;
     private String phone;//电话
     private String idcard;//身份证
     private Store store;//店铺id
     private int level;//等级
     private int state;//状态
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
     
}
