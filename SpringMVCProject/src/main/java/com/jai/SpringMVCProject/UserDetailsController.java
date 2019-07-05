package com.jai.SpringMVCProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jai.SpringMVCProject.service.UserDtlsService;

@Controller
public class UserDetailsController {
	
	public static final Logger logger = LoggerFactory.getLogger(UserDetailsController.class);
	
	@Autowired
	UserDtlsService userDtlsService;
	
	@RequestMapping(value="/fatchUserDetails", method=RequestMethod.GET)
	public String addUser(Model model) {
		model.addAttribute("command");
		return "fatchUserDetails";
		
	}

}
