package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/git")
	@ResponseBody
	public String home()
	{
		return "<h1>Devops section 1 : Git</h1>";
		
	}
}
