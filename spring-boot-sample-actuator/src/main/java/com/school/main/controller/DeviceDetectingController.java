package com.school.main.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeviceDetectingController {

	@RequestMapping(value = "/detect-device",produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> detectDevive(Device device) {
		String deviceType = null;

		if (device.isNormal()) {
			deviceType = "normal";
		} else if (device.isMobile()) {
			deviceType = "mobile";
		} else if (device.isTablet()) {
			deviceType = "tablet";
		}
	return new ResponseEntity<String>(deviceType,HttpStatus.OK);
	}

}
