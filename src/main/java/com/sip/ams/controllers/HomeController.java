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
	
	@RequestMapping("/index")
	@ResponseBody
	public String index()
	{
		return "<h1>Day 7</h1>";
		
	}
	
	
	@RequestMapping("/logout")
	@ResponseBody
	public String logout()
	{
		return "<h1>Then END</h1>";
		
	}
	
	
	
	@RequestMapping("/cours")
	@ResponseBody
	public String cours()
	{
		return "<h1>cours</h1>";
		
	}
}
