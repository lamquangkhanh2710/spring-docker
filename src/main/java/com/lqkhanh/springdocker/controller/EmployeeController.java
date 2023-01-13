package com.lqkhanh.springdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getEmployees() {
		return "LQKhanh";
	}

}