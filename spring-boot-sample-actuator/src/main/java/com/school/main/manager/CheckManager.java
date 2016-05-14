package com.school.main.manager;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.main.dto.CheckDTO;
import com.school.main.enity.CheckEntity;
import com.school.main.repository.CheckService;
import com.school.main.utils.MappingUtil;

@Service
public class CheckManager implements CheckInt {

	
	@Autowired
	CheckService checkService;
	
	public CheckDTO getCheck(String name) {
		System.out.println("=========manager entered===========");
		CheckEntity checkEntity=null;
		CheckDTO checkDTO=new CheckDTO();
		checkDTO.setName(name);
        checkDTO.setAddress("1507777");		
		checkDTO.setMobNumber("8787878787");
        checkEntity=MappingUtil.mapDTOtoEntity(checkDTO);	
        checkEntity=checkService.getCheck(checkEntity);
        checkDTO.setId(checkEntity.getId());
		return checkDTO;
	}

	
	
	
	
	
	
	
	
}
