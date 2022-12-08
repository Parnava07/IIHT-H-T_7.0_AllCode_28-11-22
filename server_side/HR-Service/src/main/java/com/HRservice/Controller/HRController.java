package com.HRservice.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.HRservice.Entity.HR;
import com.HRservice.Service.IHRService;



@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	private IHRService ihrService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr =this.ihrService.getHR(userID);
		List resources = this.restTemplate.getForObject("http://resource-service/resource/hr/" + userID, List.class);
		hr.setResource(resources);
		return hr;
		
	}

}