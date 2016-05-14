package com.school.main.utils;

import com.school.main.dto.CheckDTO;
import com.school.main.enity.CheckEntity;

public class MappingUtil {

	
	
	public static  CheckEntity mapDTOtoEntity(CheckDTO checkDTO)
	{
		CheckEntity checkEntity=new CheckEntity();
		checkEntity.setName(checkDTO.getName());
		checkEntity.setAddress(checkDTO.getAddress());
		checkEntity.setMobNumber(checkDTO.getMobNumber());
		return checkEntity;
	}
	
	
	
	
	
}
