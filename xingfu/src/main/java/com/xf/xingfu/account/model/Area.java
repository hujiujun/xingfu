package com.xf.xingfu.account.model;
/**
 * 用来定义区域的实体类
 * @author Administrator
 *
 */
public class Area {
	private int id;
	private String name;//区域名字
	private Account manager;//区域经理
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
	public Account getManager() {
		return manager;
	}
	public void setManager(Account manager) {
		this.manager = manager;
	}

	
}
