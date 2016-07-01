package com.xf.xingfu.client.service;

import com.xf.xingfu.client.model.Zcollect;

/**
 * 收藏业务逻辑的接口
 * @author Administrator
 *
 */
public interface ZcollectService {
    /**
     * 添加收藏
     * @param zcollect
     *     收藏信息
     */
	void addZcollect(Zcollect zcollect);
	
	/**
	 * 删除收藏
	 * @param zcollect
	 * 收藏信息
	 */
	void deleteZcollect(Zcollect zcollect);
	
	/**
	 * 查询收藏
	 * @param zcollect
	 * 收藏信息
	 */
	void selectZcollect(Zcollect zcollect);
	
}
