package com.xf.xingfu.account.model;
/**
 * 用来定义店铺的实体类
 * @author Administrator
 *
 */
public class Store {
	/**
	 * id 编号
	 */
	private int id;
	/**
	 * name 店铺名称
	 */
	private String name;
	/**
	 * area 区域
	 */
	private Area area;
	/**
	 * urban 城区
	 */
	private String urban;
	/**
	 * buinour 店长
	 */
	private Account buinour;
	/**
	 * address 地址
	 */
	private String address;
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
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
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
	 * @return the buinour
	 */
	public Account getBuinour() {
		return buinour;
	}
	/**
	 * @param buinour the buinour to set
	 */
	public void setBuinour(Account buinour) {
		this.buinour = buinour;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
					
			
}
