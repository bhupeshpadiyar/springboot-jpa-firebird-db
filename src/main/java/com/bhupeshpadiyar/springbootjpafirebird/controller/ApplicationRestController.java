package com.bhupeshpadiyar.springbootjpafirebird.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhupeshpadiyar.springbootjpafirebird.model.ArCustomer;
import com.bhupeshpadiyar.springbootjpafirebird.repo.ArCustomerRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ApplicationRestController {
	
	@Autowired
	private ArCustomerRepository arCustomerRepository;
	
	@GetMapping("/customers")
	public ResponseEntity<Map<String, Object>> getArCustomerData(){
		
		
		Map<String, Object> response = new LinkedHashMap<>();
		List<ArCustomer> arcustomers = arCustomerRepository.findAll();
		response.put("data", arcustomers);
		response.put("status", 200);
		response.put("message", "Data fetched successfully.");
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}

}
