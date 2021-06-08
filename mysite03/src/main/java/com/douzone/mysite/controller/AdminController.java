package com.douzone.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.mysite.security.Auth;

@Auth(role="ADMIN")
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("")
	public String main() {
		return "admin/main";
	}

	@RequestMapping(value="/main/update", method=RequestMethod.POST)
	public String updateMain(SiteVo vo) {
		return "redirect:/admin";
	}
	
	@RequestMapping("/guestbook")
	public String guesbook() {
		return "admin/guestbook";
	}
	
	@RequestMapping("/board")
	public String board() {
		return "admin/board";
	}

	@RequestMapping("/user")
	public String user() {
		return "admin/user";
	}
	
}