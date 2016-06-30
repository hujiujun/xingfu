package com.xf.xingfu.client.model;
/**
 * 房东实体类
 * @author Administrator
 *
 */
public class Landlord {

	private int id;
	private String name;//名字
	private String phone;//手机号码
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
	
}
