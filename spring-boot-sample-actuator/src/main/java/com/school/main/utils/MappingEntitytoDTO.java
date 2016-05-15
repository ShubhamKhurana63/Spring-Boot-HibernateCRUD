package com.school.main.utils;

import com.school.main.dto.CheckDTO;
import com.school.main.enity.CheckEntity;

public class MappingEntitytoDTO {
	
	
	public static CheckDTO mapCheckEntitytoDTO(CheckEntity checkEntity)
	{
		CheckDTO checkDTO=new CheckDTO();
		checkDTO.setId(checkEntity.getId());
		checkDTO.setAddress(checkEntity.getAddress());
		checkDTO.setMobNumber(checkEntity.getMobNumber());
		checkDTO.setName(checkEntity.getName());
	     return checkDTO;
	}
	
	

}
