package com.school.main.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {

	
	
	public static  <T> ResponseEntity<T> failureResponse(T message)
	{
		return new ResponseEntity<T>(message,HttpStatus.NOT_FOUND);
	}
	
	
	
}
