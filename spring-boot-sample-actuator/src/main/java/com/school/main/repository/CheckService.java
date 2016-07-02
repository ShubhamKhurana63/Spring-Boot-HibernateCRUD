package com.school.main.repository;

import com.school.main.Exception.ConnectionNotFoundException;
import com.school.main.enity.CheckEntity;

public interface CheckService {

	public CheckEntity getCheck(CheckEntity checkEntity) throws ConnectionNotFoundException;
	
	public CheckEntity getData(Integer id);
	
	public CheckEntity putForCRUD(String id,String name);
	
	
}
