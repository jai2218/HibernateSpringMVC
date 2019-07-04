package com.jai.SpringMVCProject;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexhome(Model model) {
		model.addAttribute("command");
		return "index";
	}

	@RequestMapping(value = "/form_component", method = RequestMethod.GET)
	public String formcomponent(Model model) {
		model.addAttribute("command");
		return "form_component";
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String formprofile(Model model) {
		model.addAttribute("command");
		return "profile";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String formlogin(Model model) {
		model.addAttribute("command");
		return "login";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("command");
		return "registration";
	}

}
