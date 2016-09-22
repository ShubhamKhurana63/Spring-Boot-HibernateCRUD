package com.school.main.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.main.Exception.ConnectionNotFoundException;
import com.school.main.Exception.ProjectException;
import com.school.main.dto.CheckDTO;
import com.school.main.dto.Quote;
import com.school.main.enity.CheckEntity;
import com.school.main.repository.CheckService;
import com.school.main.utils.MappingEntitytoDTO;
import com.school.main.utils.MappingUtil;
import com.school.main.utils.RestInvocation;

@Service
public class CheckManager implements CheckInt {

	@Autowired
	CheckService checkService;

	public CheckDTO getCheck(String name) throws ProjectException {
		System.out.println("=========manager entered===========");
		CheckEntity checkEntity = null;
		CheckDTO checkDTO = new CheckDTO();
		checkDTO.setName(name);
		checkDTO.setAddress("1507777");
		checkDTO.setMobNumber("8787878787");
		checkEntity = MappingUtil.mapDTOtoEntity(checkDTO);
		try {
			checkEntity = checkService.getCheck(checkEntity);
		} catch (ConnectionNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ProjectException("Internal Server Error");
		}
		checkDTO.setId(checkEntity.getId());
		return checkDTO;
	}

	@Override
	public CheckDTO getData(Integer id) {
		CheckEntity checkEntity = null;
		CheckDTO checkDTO = null;
		checkEntity = checkService.getData(id);
		if (checkEntity != null) {
			checkDTO = MappingEntitytoDTO.mapCheckEntitytoDTO(checkEntity);
		}
		return checkDTO;
	}

	@Override
	public CheckDTO saveForPut(String id, String name) {
		CheckDTO checkDTO2 = null;
		CheckEntity checkEntity = null;
		CheckEntity checkingObject = checkService.putForCRUD(id, name);
		CheckDTO checkdto = MappingEntitytoDTO.mapCheckEntitytoDTO(checkingObject);
		// checkEntity = MappingUtil.mapDTOtoEntity(checkDTO);
		// checkEntity = checkService.putForCRUD(checkEntity);
		/*
		 * if (checkEntity != null) { checkDTO2 =
		 * MappingEntitytoDTO.mapCheckEntitytoDTO(checkEntity); }
		 */
		return checkdto;
	}

	@Override
	public Quote getQuote() {
		Quote quote = null;
		quote = RestInvocation.getRequest("http://gturnquist-quoters.cfapps.io/api/random");
		if (quote != null) {
			return quote;
		}
		return null;
	}
}
