package com.mm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mm.model.Employee;
import com.mm.model.Status;
import com.mm.model.VUser;
import com.mm.model.ZUser;
import com.mm.services.ZUserServices;
@Controller
@RequestMapping("/zlogin")
public class LoginController {
	@Autowired
	ZUserServices zUserServices;

	static final Logger logger = Logger.getLogger(RestController.class);
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addUser(@RequestBody ZUser user) {
		try {
			zUserServices.addUser(user);
			return new Status(1, "User added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status loginUser(@RequestBody ZUser user) {
		try {
			zUserServices.loginUser(user);
			return new Status(1, "Login Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "deactivate/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deActivateUser(@PathVariable("id") long id,@PathVariable("status") String status) {

		try {
			zUserServices.deActivateUser(id,status);
			return new Status(1, "User DeActivate Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public @ResponseBody
	List<ZUser> getUser() {

		List<ZUser> user = null;
		try {
			user = zUserServices.getUserList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	@RequestMapping(value = "/addVendor", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addVendor(@RequestBody VUser user) {
		try {
			zUserServices.addVendor(user);
			return new Status(1, "Vendor added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	

}
