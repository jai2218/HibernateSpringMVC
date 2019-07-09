package com.jai.SpringMVCProject.model;

import java.util.Map;

public class RegistrationJSONResponse {
	
	private Registration regJSON;
	
	private Boolean validated;
	
	private Map<String, String> errorMessages;

	public Registration getRegJSON() {
		return regJSON;
	}

	public Boolean getValidated() {
		return validated;
	}

	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}

	public void setRegJSON(Registration regJSON) {
		this.regJSON = regJSON;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}

	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	

}
