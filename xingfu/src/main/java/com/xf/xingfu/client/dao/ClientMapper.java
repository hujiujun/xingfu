package com.xf.xingfu.client.dao;

import java.sql.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xf.xingfu.account.model.Account;

/**
 * 用于定义账号、区域、店铺的方法
 * @author Administrator
 *
 */
@Mapper
public interface ClientMapper {

	
	@Insert("insert into client values(#{name},#{phone},#{uit},#{price},#{faclity},#{state},#{account},#{date})")
	void addclient(@Param("name") String name,
			@Param("phone") String phone,
			@Param("uit") int uit,@Param("price") int price,
			@Param("faclity") String faclity,
			@Param("state") int state,@Param("account") int account,@Param("date") String date
			);
	
}
