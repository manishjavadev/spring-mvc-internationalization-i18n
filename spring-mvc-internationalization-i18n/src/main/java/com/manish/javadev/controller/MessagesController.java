package com.manish.javadev.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MessagesController {
	private static final Logger logger = LoggerFactory.getLogger(MessagesController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/test")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "home";
	}
}
