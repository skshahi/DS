package com.app.rest.web.services.user.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timeStamp;
	private String name;
	private String details;
	public ErrorDetails(LocalDateTime timeStamp, String name, String details) {
		super();
		this.timeStamp = timeStamp;
		this.name = name;
		this.details = details;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public String getName() {
		return name;
	}
	public String getDetails() {
		return details;
	}
	
	
	
	

}
