package com.xf.xingfu.account.model;
/**
 * 用来定义店铺的实体类
 * @author Administrator
 *
 */
public class Store {
	private int id;
	private String name;//店铺名字
	private Area area;//区域
	private String urban;//城区
	private Account buinour;//店长
	private String address;//地址
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

	public String getUrban() {
		return urban;
	}
	public void setUrban(String urban) {
		this.urban = urban;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Account getBuinour() {
		return buinour;
	}
	public void setBuinour(Account buinour) {
		this.buinour = buinour;
	}
				
			
}
