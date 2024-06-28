package com.itl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping(value = "/Test", produces = "application/json")
	public String demo() {

		logger.info("Branch with BranchId {} already exists.");
		logger.info("Branch with BranchId {} already exists.");
		
		return "demo from master serive";
	}

}
