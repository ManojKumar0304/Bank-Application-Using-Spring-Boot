package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Bank_Manoj;

import com.web.service.Bank_Service;


@Controller
public class Bank_Controller {
	@Autowired
	private Bank_Service service;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
		
	}
	@RequestMapping("/adduser")
    public String userregister()
    {
		return "register";
    }
	@RequestMapping("/register")
	public String savedata(Bank_Manoj bank,ModelMap model)
	{
		Bank_Manoj e=service.saveEmployee_Invoice(bank);
		return "success";
	}
	
	
	
	
}
