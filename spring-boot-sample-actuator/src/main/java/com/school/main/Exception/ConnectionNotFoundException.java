package com.school.main.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class ConnectionNotFoundException extends Throwable {

	public ConnectionNotFoundException(String message)
	{
		super(message);
	}
}
