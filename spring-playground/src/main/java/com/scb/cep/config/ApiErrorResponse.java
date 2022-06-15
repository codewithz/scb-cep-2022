package com.scb.cep.config;

import java.time.LocalDateTime;

public class ApiErrorResponse {
	
	String message;
	int httpStatusCode;
	String httpStatus;
	boolean success;
	boolean error;
	LocalDateTime timestamp;
	String path;
	
	
	public ApiErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ApiErrorResponse(String message, int httpStatusCode, String httpStatus, boolean success, boolean error,
			LocalDateTime timestamp, String path) {
		super();
		this.message = formatMessage(message);
		this.httpStatusCode = httpStatusCode;
		this.httpStatus = httpStatus;
		this.success = success;
		this.error = error;
		this.timestamp = timestamp;
		this.path = path;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = formatMessage(message);
	}


	public int getHttpStatusCode() {
		return httpStatusCode;
	}


	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}


	public String getHttpStatus() {
		return httpStatus;
	}


	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}


	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}
	
	private String formatMessage(String message) {
		int doubleQuotesIndex=message.indexOf("\"");
		message=message.substring(doubleQuotesIndex+1);
		message=message.replace("\"","");
		return message;
		
	}
	

}
