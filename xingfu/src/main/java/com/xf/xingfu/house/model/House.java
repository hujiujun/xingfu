package com.xf.xingfu.house.model;

import java.sql.Date;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Store;
import com.xf.xingfu.client.model.Landlord;

/**
 * 房源表  定义属性 GET SET方法
 * @author Administrator
 *
 */
public class House {

	private int id;//编号
	private Landlord landlord;//房东 fk
	private Account account;//业务员 fk
	private Store store;//店铺 fk
	private String urban;//城区
	private String cell;//小区
	private String address;//地址
	private int floor;//楼层
	private int uit;//户型
	private int area;//面积
	private int mold;//装修类型
	private int price;//价格
	private String faclity;//设施
	private String remark;//备注
	private int state;//状态
	private Date edttime;//录入时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Landlord getLandlord() {
		return landlord;
	}
	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public String getUrban() {
		return urban;
	}
	public void setUrban(String urban) {
		this.urban = urban;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getUit() {
		return uit;
	}
	public void setUit(int uit) {
		this.uit = uit;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getMold() {
		return mold;
	}
	public void setMold(int mold) {
		this.mold = mold;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getEdttime() {
		return edttime;
	}
	public void setEdttime(Date edttime) {
		this.edttime = edttime;
	}
	
}
