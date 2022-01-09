package com.bankui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountOpenController {
	
	@RequestMapping("/")
	public String accountOpen() {
		return "account_open";
	}
	
	@RequestMapping("/login")
	public String showScreen() {
		return "account_open";
	}

}
