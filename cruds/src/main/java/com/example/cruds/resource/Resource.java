package com.example.cruds.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class Resource extends RuntimeException {
	
	private String fieldname;
	private Integer fieldvalue;
	private String resourcename;
	
	        public String getFieldname() {
		return fieldname;
	                                       }
	
	          public Integer getFieldvalue() {
		return fieldvalue;
	                }
	
	
	public String getResourcename() {
		return resourcename;
	}
	public Resource(String resourcename, String fieldname, Integer fieldvalue) {
		super(String.format("%s not found with %s:'%s'",resourcename,fieldname,fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	

}
