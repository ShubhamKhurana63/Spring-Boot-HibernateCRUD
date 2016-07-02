package com.school.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.school.main.Exception.ProjectException;
import com.school.main.dto.CheckDTO;
import com.school.main.manager.CheckInt;

@Controller
@PropertySource("classpath:check.properties")
public class CheckController {

	@Value("${data}")
	private String check;

	@Autowired
	CheckInt checkInt;

	@RequestMapping(value = "/check/{id}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> check(@PathVariable String id) {

		System.out.println("==========controller entered============");
		CheckDTO checkDTO = null;
		try {
			checkDTO = checkInt.getCheck(id);
		} catch (ProjectException e) {
			// return Response.failureResponse("internal server error");
		}
		System.out.println("===========controller exited==============");
		return new ResponseEntity<CheckDTO>(checkDTO, HttpStatus.OK);
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> getData(@RequestParam Integer id) {
		System.out.println(check);
		CheckDTO checkDTO = checkInt.getData(id);
		return new ResponseEntity<CheckDTO>(checkDTO, HttpStatus.OK);
	}

	@RequestMapping(value = "/check/{id}/update/{name}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CheckDTO> checkPUTinCRUD(@PathVariable String id,@PathVariable String name) {
		CheckDTO checkDTO2 = checkInt.saveForPut(id,name);
		return new ResponseEntity<CheckDTO>(checkDTO2, HttpStatus.OK);
	}
}
