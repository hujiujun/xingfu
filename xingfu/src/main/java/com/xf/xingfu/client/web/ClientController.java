package com.xf.xingfu.client.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xf.xingfu.client.model.Client;
import com.xf.xingfu.client.service.ClientService;

/**
 * 客户前台控制器
 * @author Administrator
 *
 */
@Controller
public class ClientController {
	
	private ClientService clientService;
	
	@RequestMapping(value="addclient", method=RequestMethod.GET)
	public String addcl(){
		return "addclient";
		
	}
	@RequestMapping(value="addclient2", method=RequestMethod.POST)
	public String addclient(Client client,HttpServletRequest request){
		HttpSession session=request.getSession();
		int id=(Integer) session.getAttribute("id");
		client.setId(id);
		//获得当前时间
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-HH时mm分ss秒");
		Date date = new Date(currentTime);
		String edttime=formatter.format(date);
		client.setEdttime(edttime);
		clientService.addClient(client);
		return "index";
		
	}

}
