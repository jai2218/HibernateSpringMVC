package com.jai.SpringMVCProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jai.SpringMVCProject.model.UserDetails;
import com.jai.SpringMVCProject.service.UserDtlsService;

@Controller
public class UserDetailsController {
	
	public static final Logger logger = LoggerFactory.getLogger(UserDetailsController.class);
	
	@Autowired
	UserDtlsService userDtlsService;
	
	@RequestMapping(value="/fatchUserDetails", method=RequestMethod.GET)
	public String fetchUsers(Model model) {
		model.addAttribute("command");
		return "fatchUserDetails";	
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public String addUser(Model model) {
		model.addAttribute("command", new UserDetails());
		return "addUser";	
	}
	
	@RequestMapping(value="/editUser", method=RequestMethod.GET)
	public String editUser(Model model) {
		model.addAttribute("command");
		return "fatchUserDetails";	
	}
	
	@RequestMapping(value="/viewUser", method=RequestMethod.GET)
	public String viewUser(Model model) {
		model.addAttribute("command");
		return "fatchUserDetails";	
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveUserDtls(@ModelAttribute("user") UserDetails userDtilsSave, Model model) {
		model.addAttribute("command");
		userDtlsService.saveUserDtls(userDtilsSave);
		logger.info("User Added Successfully.");
		
		return "fatchUserDetails";
	}

}
