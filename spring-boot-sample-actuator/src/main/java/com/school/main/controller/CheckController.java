package com.school.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.main.Exception.ProjectException;
import com.school.main.dto.CheckDTO;
import com.school.main.manager.CheckInt;
import com.school.main.utils.Response;

@Controller
public class CheckController {

	@Autowired
	CheckInt checkInt;
	@RequestMapping(value = "/check/{id}",method=RequestMethod.POST,produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> check(@PathVariable String id) {
		System.out.println("==========controller entered============");
		CheckDTO checkDTO = null;
		try {
			checkDTO = checkInt.getCheck(id);
		} catch (ProjectException e) {
		//return Response.failureResponse("internal server error");	
		}
		System.out.println("===========controller exited==============");
		return new ResponseEntity<CheckDTO>(checkDTO, HttpStatus.OK);
	}
	@RequestMapping(value="/check",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> getData(@RequestParam Integer id)
	{
		CheckDTO checkDTO=checkInt.getData(id);
		return new ResponseEntity<CheckDTO>(checkDTO,HttpStatus.OK);
	}

}
