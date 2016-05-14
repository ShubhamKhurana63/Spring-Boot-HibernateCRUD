package com.school.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.main.dto.CheckDTO;
import com.school.main.manager.CheckInt;

@Controller
public class CheckController {

	@Autowired
	CheckInt checkInt;
	@RequestMapping(value = "/check/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> check(@PathVariable String id) {
		System.out.println("==========controller entered============");
		CheckDTO checkDTO = null;
		checkDTO = checkInt.getCheck(id);
		System.out.println("===========controller exited==============");

		return new ResponseEntity<CheckDTO>(checkDTO, HttpStatus.OK);
	}

}
