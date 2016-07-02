package com.xf.xingfu.account.model;
/**
 * 用来定义账号的实体类
 * @author Administrator
 *
 */
public class Account {
	/**
	 * id 编号
	 */
     private int id;
     /**
 	 * name 账号
 	 */
     private String name;
     /**
 	 * password 密码
 	 */
     private String password;
     /**
 	 * phone 电话
 	 */
     private String phone;
     /**
 	 * idcard 身份证
 	 */
     private String idcard;
     /**
 	 * store 店铺id
 	 */
     private Store store;
     /**
 	 * level 等级
 	 */
     private int level;
     /**
 	 * state 状态
 	 */
     private int state;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}
	/**
	 * @param store the store to set
	 */
	public void setStore(Store store) {
		this.store = store;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
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
