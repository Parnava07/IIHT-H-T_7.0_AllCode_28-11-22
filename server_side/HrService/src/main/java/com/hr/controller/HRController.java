package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.HR;
import com.hr.service.IHrservice;

@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	private IHrservice hrService;
	
	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr =this.hrService.getHR(userID);
		return hr;
		
	}

}
