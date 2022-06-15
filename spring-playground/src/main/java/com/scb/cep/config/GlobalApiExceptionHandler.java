package com.scb.cep.config;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalApiExceptionHandler {
	
	@ExceptionHandler(value= {ResponseStatusException.class})
	public ResponseEntity<Object> handleAPIException(ResponseStatusException exception,WebRequest request){
		
		String path=request.getDescription(false).replace("uri=","");
//		String path=request.getDescription(true);
		
		//Create a response with proper exception 
		
		ApiErrorResponse response=new ApiErrorResponse();
		response.setMessage(exception.getMessage());
		response.setHttpStatus(String.valueOf(exception.getStatus()));
		response.setHttpStatusCode(exception.getStatus().value());
		response.setError(true);
		response.setSuccess(false);
		response.setTimestamp(LocalDateTime.now());
		response.setPath(path);
		
		//Return the response
		
		return new ResponseEntity<Object>(response,exception.getStatus());
		
	}

}
