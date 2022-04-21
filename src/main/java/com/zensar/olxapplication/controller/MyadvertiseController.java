package com.zensar.olxapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxapplication.category;
import com.zensar.olxapplication.status;

@RestController
public class MyadvertiseController {

	static List<category> categorys = new ArrayList<category>();
	static {
		categorys.add(new category(1, "furniture"));
		categorys.add(new category(2, "cars"));
		categorys.add(new category(3, "mobiles"));
		categorys.add(new category(4, "Real Estate"));
		categorys.add(new category(5, "Sports"));

	}

	@GetMapping("/advertises/category")
	public List<category> getAllUsers(@RequestHeader("userName") String userName,
			@RequestHeader("password") String password) {

		if (userName.equals("anand") && password.equals("anand123")) {
			return categorys;
		}

		return null;

	}

	static List<status> status = new ArrayList<status>();
	static {
		status.add(new status(1L, "open"));
		status.add(new status(2L, "closed"));

	}

	@GetMapping("/advertises/status")
	public List<status> getAllUsers1(@RequestHeader("userName") String userName,
			@RequestHeader("password") String password) {

		if (userName.equals("anand") && password.equals("anand123")) {
			return status;
		}

		return null;

	}
}