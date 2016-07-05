package com.xf.xingfu.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xf.xingfu.client.dao.ClientMapper;
import com.xf.xingfu.client.model.Client;

/**
 * 实现客户业务逻辑方法接口
 * @author Administrator
 *
 */
@Service(value = "clientService")
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientMapper clientMapper;
	
	
	public ClientMapper getClientMapper() {
		return clientMapper;
	}

	public void setClientMapper(ClientMapper clientMapper) {
		this.clientMapper = clientMapper;
	}

	@Override
	public void addClient(Client client) {
		clientMapper.addclient(client.getName(),
				client.getPhone(), client.getUit(), client.getPrice(),
				client.getFaclity(), client.getState(), 
				client.getAccount(), client.getEdttime());

		
	}

	@Override
	public void upClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
