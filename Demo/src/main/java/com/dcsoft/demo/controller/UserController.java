package com.dcsoft.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dcsoft.demo.entity.User;
import com.dcsoft.demo.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	/**
	 * 添加用户
	 * 
	 * @param id
	 *            用户id
	 * @param name
	 *            用户名
	 * @param address
	 *            地址
	 * @return 添加用户
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addUser(
			@RequestParam(value = "id", required = false) final int id,
			@RequestParam(value = "name", required = false) final String name,
			@RequestParam(value = "address", required = false) final String address)
			 {
		User user = new User();
		
		user.setName(name);
		user.setAddress(address);
		userService.saveUser(user);
		
		String url = new String("redirect:/users/list");
				 
		return new ModelAndView(url);
	 
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(
			@RequestParam(value = "id", required = false) final int id,
			@RequestParam(value = "name", required = false) final String name,
			@RequestParam(value = "address", required = false) final String address)
			 {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		userService.saveUser(user);
		
		String url = new String("redirect:/users/list");
				 
		return new ModelAndView(url);
	 
	}

	/**
	 * 添加用户
	 * 
	 * @param id
	 *            用户id
	 * @param name
	 *            用户名
	 * @param address
	 *            地址
	 * @return 添加用户
	 */
	@RequestMapping(value = "/add/{id}/{name}/{address}", method = RequestMethod.POST)
	public User addUser2(@PathVariable int id, @PathVariable String name, @PathVariable String address) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		userService.saveUser(user);
		return user;
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public ModelAndView deleteBook(@PathVariable int id) {
		userService.delete(id);
		
		String url = new String("redirect:/users/list");
		 
		return new ModelAndView(url);
	}

	 
	/**
	 * 跳转到templates/userlist.ftl页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String actionList(Map<String, Object> map) {
		List<User> actionsRunners = userService.findAll();
		map.put("runners", actionsRunners);
		
		return "userlist";
	}

	/**
	 * 根据id查询用户
	 * 跳转到templates/useredit.ftl页面
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUser(@PathVariable int id,Map<String, Object> map) {
		User user = userService.findOne(id);
		map.put("user", user);
		return "user/useredit";
	}

 
}