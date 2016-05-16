package com.school.main.manager;

import com.school.main.Exception.ProjectException;
import com.school.main.dto.CheckDTO;

public interface CheckInt {
	public CheckDTO getCheck(String name) throws ProjectException;

	public CheckDTO getData(Integer id);
}
