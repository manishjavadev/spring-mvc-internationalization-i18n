package com.manish.javadev.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(MessagesController.class);

	@RequestMapping("/register")
	public String userLogin(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user") User user) {
		System.out.println(user);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		mv.addObject("user", user);
		return mv;
	}
}
