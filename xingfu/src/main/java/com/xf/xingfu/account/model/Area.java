package com.xf.xingfu.account.model;
/**
 * 用来定义区域的实体类
 * @author Administrator
 *
 */
public class Area {
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * name 区域名字
	 */
	private String name;
	/**
	 * manager 区域经理
	 */
	private Account manager;
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
	 * @return the manager
	 */
	public Account getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(Account manager) {
		this.manager = manager;
	}
	
}
