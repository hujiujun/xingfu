package com.xf.xingfu.account.dao;

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
public interface AccountMapper {

	@Select("select id,name,password,level from account where name = #{name} and password=#{password} and level=#{level}")
	Account login(@Param("name") String name,
			@Param("password") String password,
			@Param("level") int level);
	
	@Update("update account set password=#{password} where id=#{id}")
	Account uppwd(@Param("password") String password,
			@Param("id") int id);
	
	@Insert("insert into store values(#{name},#{area},#{urban},#{buinour},#{address})")
	void addscore(@Param("name") String name,@Param("area") int area,
			@Param("urban") String urban,@Param("buinour") int buinour,
			@Param("address") String address);
	
}
