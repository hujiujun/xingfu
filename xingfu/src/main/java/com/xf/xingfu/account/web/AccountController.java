package com.xf.xingfu.account.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.service.AccountService;



/**
 * 处理账号业务逻辑的控制
 * @author Administrator
 *
 */
@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	/**
	 * 登录验证  表单
	 * @param name 账号
	 * @param password 密码
	 * @param model 模型
	 * @return
	 */
	@RequestMapping(value="account", method=RequestMethod.POST)
	public String DL(Account account,
			Model model
			){
      String name =account.getName();
      String password =account.getPassword();
      int level =account.getLevel();
      System.out.println(name+" "+password+" "+level);
      Account account1 = accountService.login(name, password,level);
	  /**
		 * 登录失败到登录页面
		 */
      if(account1.equals(null)){
      	return "home";
      	
      }
      model.addAttribute("a", account1);
           //登录成功跳转到相应成功页面
      if(account1.getLevel()==3){
     //管理员
    	  System.out.println(account1.getId());
		    return "index3";
      }else if(account1.getLevel()==2){
      	//区域经理
      	return "index2";
      }else if(account1.getLevel()==1){
      	//店长
      	return "index1";
      }else{
      	//员工
      	return "index";
      }
	}
	
	/**
	 * 跳转到修改密码的页面
	 * @return
	 */
	@RequestMapping(value = "account/uppwd/{id}", method = RequestMethod.GET)
	public String uppwd(@PathVariable(value = "id") int id,
			Model model){
		Account account = new Account();
		account.setId(id);
		model.addAttribute("a", account);
		return "uppwd";
		
	}
	@RequestMapping(value="account/uppwd/account/uppwd", method=RequestMethod.POST)
	public String upPWD(Account account,
			Model model){
		
		String password=account.getPassword();
		int id=account.getId();
		System.out.println(password+" "+id);
		accountService.updatepwd(password, id);
		
		return "home";
	}
	/**
	 * 退出登录
	 * @return
	 */
	@RequestMapping(value ="account/outlogin",method = RequestMethod.GET)
	public String outlogin(){
		
		return "home";
		
	}
}
