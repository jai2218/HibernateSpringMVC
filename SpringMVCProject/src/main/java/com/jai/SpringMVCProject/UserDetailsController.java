package com.jai.SpringMVCProject;

import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jai.SpringMVCProject.model.UserDetails;
import com.jai.SpringMVCProject.model.UserDetailsJsonResponse;
import com.jai.SpringMVCProject.service.UserDtlsService;
import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author Jai Shanker (05-07-2019)
 */

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
	
	/*@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveUserDtls(@ModelAttribute("user") UserDetails userDtilsSave, Model model) {
		model.addAttribute("command");
		userDtlsService.saveUserDtls(userDtilsSave);
		logger.info("User Added Successfully.");
		
		return "fatchUserDetails";
	}*/
	
	   @PostMapping(value = "/save", produces = { MediaType.APPLICATION_JSON_VALUE })
	   @ResponseBody
	   public UserDetailsJsonResponse save(@ModelAttribute("addUserForm") @Valid UserDetails userDtlsJson, BindingResult result, Model model) {

		   UserDetailsJsonResponse respone = new UserDetailsJsonResponse();
	      
	      if(result.hasErrors()){
	         
	         //Get error message
	         Map<String, String> errors = result.getFieldErrors().stream()
	               .collect(
	                     Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
	                 );
	         
	         respone.setValidated(false);
	         respone.setErrorMessages(errors);
	      }else{
	         // Implement business logic to save employee into database
	         //..
	    	 model.addAttribute("command");
	    	respone.setValidated(true);
	  		userDtlsService.saveUserDtls(userDtlsJson);
	  		logger.info("User Added Successfully.");
	  	
	         respone.setUserDetailsJson(userDtlsJson);
	      }
	      return respone;
	   }
	   

}
