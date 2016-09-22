package com.school.main.manager;

import com.school.main.Exception.ProjectException;
import com.school.main.dto.CheckDTO;
import com.school.main.dto.Quote;

public interface CheckInt {
	public CheckDTO getCheck(String name) throws ProjectException;

	public CheckDTO getData(Integer id);
	
	public CheckDTO saveForPut(String id,String name);

	public Quote getQuote();
	
	
}
