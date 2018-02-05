package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.constant.ViewConstant;
import com.udemy.model.ContactModel;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	
	@GetMapping("/cancel")
	public String cancel() {
		return ViewConstant.CONTACTS;
	}
	
	@GetMapping("/contactform")
	private String redirectContactForm(Model model) {
		model.addAttribute("conctactModel", new ContactModel());
		
		return ViewConstant.CONTACT_FORM;
	}
}
