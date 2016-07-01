package com.xf.xingfu.account.service;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Area;

/**
 * 区域业务逻辑方法处理接口
 * @author Administrator
 *
 */
public interface AreaService {
    
	/**
	 * 添加区域
	 * @param area   区域名字
	 * @param account  区域经理
	 */
	void addArea(Area area,Account account);
	
	/**
	 * 修改区域信息
	 * @param name 区域名字
	 */
	void updArea(Area area);
}
