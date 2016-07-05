package com.xf.xingfu.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xf.xingfu.house.dao.HouseMapper;
import com.xf.xingfu.house.model.House;

/**
 * 实现业务逻辑的接口
 * @author Administrator
 *
 */
@Service(value = "houseService")
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper houseMapper;
	
	public HouseMapper getHouseMapper() {
		return houseMapper;
	}

	public void setHouseMapper(HouseMapper houseMapper) {
		this.houseMapper = houseMapper;
	}

	@Override
	public void addHous(House house) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateHous(House house) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectHous(House house) {
		// TODO Auto-generated method stub
		
	}

}
