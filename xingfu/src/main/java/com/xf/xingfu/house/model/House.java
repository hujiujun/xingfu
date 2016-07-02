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
	/**
	 * id	编号
	 */
	private int id;
	/** 
	 * landlord 房东	fk
	 */
	private Landlord landlord;
	/**
	 * account	业务员  fk	
	 */
	private Account account;
	/**
	 * store 店铺  fk
	 */
	private Store store;
	/**
	 * urban 城区
	 */
	private String urban;
	/**
	 * cell 小区
	 */
	private String cell;
	/**
	 * address 地址
	 */
	private String address;
	/**
	 * floor 楼层
	 */
	private int floor;
	/**
	 * uit	户型
	 */
	private int uit;
	/**
	 * area 面积
	 */
	private int area;
	/**
	 * mold 装修类型
	 */
	private int mold;
	/**
	 * price 价格
	 */
	private int price;
	/**
	 * faclity 设备
	 */
	private String faclity;
	/**
	 * remark 备注
	 */
	private String remark;
	/**
	 * state 状态
	 */
	private int state;
	/**
	 * edttime 录入时间
	 */
	private Date edttime;
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
	 * @return the landlord
	 */
	public Landlord getLandlord() {
		return landlord;
	}
	/**
	 * @param landlord the landlord to set
	 */
	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
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
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}
	/**
	 * @param cell the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
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
	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}
	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	/**
	 * @return the uit
	 */
	public int getUit() {
		return uit;
	}
	/**
	 * @param uit the uit to set
	 */
	public void setUit(int uit) {
		this.uit = uit;
	}
	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}
	/**
	 * @return the mold
	 */
	public int getMold() {
		return mold;
	}
	/**
	 * @param mold the mold to set
	 */
	public void setMold(int mold) {
		this.mold = mold;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the faclity
	 */
	public String getFaclity() {
		return faclity;
	}
	/**
	 * @param faclity the faclity to set
	 */
	public void setFaclity(String faclity) {
		this.faclity = faclity;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
	/**
	 * @return the edttime
	 */
	public Date getEdttime() {
		return edttime;
	}
	/**
	 * @param edttime the edttime to set
	 */
	public void setEdttime(Date edttime) {
		this.edttime = edttime;
	}
	
}
