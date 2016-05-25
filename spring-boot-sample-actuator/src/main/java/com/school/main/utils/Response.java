package com.school.main.utils;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private T data;
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	private String statusCode;
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
	
	public Response()
	{
		
	}
	
	public Response(String statusCode,String message,T data)
	{
		this.statusCode=statusCode;
		this.message=message;
		
	}
	
	
	
	public static  <T> ResponseEntity<Response<T>> failureResponse(String statusCode,String message,T data)
	{
	Response<T>  response=new Response<T>(statusCode, message, data);
		return new ResponseEntity<Response<T>>( response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
}
