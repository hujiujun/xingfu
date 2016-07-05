package com.xf.xingfu.account.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xf.xingfu.account.model.Account;
import com.xf.xingfu.account.model.Store;
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
			Model model,
			HttpServletRequest request){
      String name =account.getName();
      String password =account.getPassword();
      int level =account.getLevel();
      System.out.println(name+" "+password+" "+level);
      Account account1 = accountService.login(name, password,level);
	  /**
		 * 登录失败到登录页面
		 */
      if(account1==null){
      	return "home";	
      }
      HttpSession session=request.getSession();
      session.setAttribute("id", account1.getId());
      session.setAttribute("level", account1.getLevel());
      session.setAttribute("name", account1.getName());
      model.addAttribute("a", account1);
           //登录成功跳转到相应成功页面
      
      	return "index";
      
	}
	
	
	@RequestMapping(value="addaccountd", method=RequestMethod.GET)
	public String adddianz(){
		
		return "addaccountd";
		
	}
	@RequestMapping(value="addaccountd", method=RequestMethod.POST)
	public String adddianzhang(){
		
		return "addaccountd";
		
	}
	/**
	 * 跳转到修改密码的页面
	 * @return
	 */
	@RequestMapping(value = "uppwd", method = RequestMethod.GET)
	public String uppwd(){
		return "uppwd";
		
	}
	
	@RequestMapping(value = "addstore", method = RequestMethod.GET)
	public String addstore(){
		
		return "addstore";
		
	}
	
    @RequestMapping(value = "addstore", method = RequestMethod.POST)
   public String addstore2(Store store,Model model
		   ,HttpServletRequest request){
    	HttpSession session=request.getSession();
		int id=(Integer) session.getAttribute("id");
		store.setArea(id);
		System.out.println(store.getName()+" "+
				store.getArea()+" "+store.getUrban()+" "+ 
				store.getBuinour()+" "+store.getAddress());
		
    	accountService.addStore(store);
    	
		return "index";
		
	}
	//修改密码
	@RequestMapping(value="uppwd2", method=RequestMethod.POST)
	public String upPWD(Account account,
			Model model,
			HttpServletRequest request){
		String password=account.getPassword();
		HttpSession session=request.getSession();
		int id=(Integer) session.getAttribute("id");
		System.out.println(password+" "+id);
		accountService.updatepwd(password, id);
		
		return "home";
	}
	/**
	 * 退出登录
	 * @return
	 */
	@RequestMapping(value ="outlogin",method = RequestMethod.GET)
	public String outlogin(HttpServletRequest request, HttpServletResponse response){
		HttpSession session=request.getSession();
		//方式二：将会话对象销毁
				session.invalidate();
				//清除缓存
				response.setHeader("Pragma","No-cache");
			    response.setHeader("Cache-Control","no-cache");
			    response.setDateHeader("Expires",0);
		return "home";
		
	}
}
