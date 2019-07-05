package com.jai.SpringMVCProject.model;

import java.util.Map;

public class UserDetailsJsonResponse {
	
	private UserDetails userDetailsJson;
	
	private Boolean validated;
	
	private Map<String, String> errorMessages;

	public UserDetails getUserDetailsJson() {
		return userDetailsJson;
	}

	public Boolean getValidated() {
		return validated;
	}

	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}

	public void setUserDetailsJson(UserDetails userDetailsJson) {
		this.userDetailsJson = userDetailsJson;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	

}
