package com.dk.demo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dk.model.UserDetail;
import com.dk.service.IUserDetailService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserDetailService userDetailService;

	@RequestMapping(path = "save", method = RequestMethod.POST)
	public @ResponseBody UserDetail save(@RequestBody UserDetail user) {

		user = userDetailService.save(user);

		return user;
	}

	@RequestMapping(path = "update", method = RequestMethod.POST)
	public @ResponseBody UserDetail update(@RequestBody UserDetail user) {

		user = userDetailService.update(user);

		return user;
	}

	@RequestMapping(path = "delete/{emailId}", method = RequestMethod.POST)
	public @ResponseBody boolean update(@PathVariable("emailId") BigInteger userId) {

		UserDetail user = userDetailService.findByUserId(userId);

		userDetailService.delete(user);

		return true;
	}

	@RequestMapping(path = "getAll", method = RequestMethod.POST)
	public @ResponseBody List<UserDetail> getAll() {

		List<UserDetail> list = userDetailService.findAll();

		return list;
	}

}
