package com.sms.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/add")
	public String add() {
		return "adInfo";
	}
	@GetMapping("/update")
	public String update() {
		return "updateInfo";
	}
	@GetMapping("/del")
	public String delete() {
		return "removeInfo";
	}
	@GetMapping("/view")
	public String view() {
		return "viewInfo";
	}
	

}
