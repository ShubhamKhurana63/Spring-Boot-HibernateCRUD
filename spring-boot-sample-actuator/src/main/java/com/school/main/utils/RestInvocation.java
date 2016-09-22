package com.school.main.utils;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.school.main.dto.Quote;

public class RestInvocation {

	public  static Quote  getRequest(String uri) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		// HttpEntity<T> entity=new HttpEntity<T>("",httpHeaders);
		Quote quote = restTemplate.getForObject(uri, Quote.class);
		return quote;
	}

}
