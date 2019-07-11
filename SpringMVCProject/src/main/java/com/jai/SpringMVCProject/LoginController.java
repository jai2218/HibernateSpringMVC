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

import com.jai.SpringMVCProject.model.Registration;
import com.jai.SpringMVCProject.model.RegistrationJSONResponse;
import com.jai.SpringMVCProject.model.UserDetails;
import com.jai.SpringMVCProject.model.UserDetailsJsonResponse;
import com.jai.SpringMVCProject.service.RegistrationService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	RegistrationService regService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String formlogin(Model model) {
		model.addAttribute("command");
		return "login";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("command", new Registration());
		return "registration";
	}
	
	@PostMapping(value = "/saveRegistration", produces = { MediaType.APPLICATION_JSON_VALUE })
	   @ResponseBody
	   public RegistrationJSONResponse regSave(@ModelAttribute("myRegForm") @Valid Registration reg, BindingResult result, Model model) {

		RegistrationJSONResponse respone = new RegistrationJSONResponse();
	      
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
	    	model.addAttribute("command: ");
	    	respone.setValidated(true);
	  		regService.saveRegistrationDtls(reg);
	  		logger.info("User Added Successfully.");
	  	
	         respone.setRegJSON(reg);
	       
	      }
	      return respone;
	   }

}
