package com.sellopy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<?>getDetails(HttpServletRequest request){
		String id = request.getSession().getId();// for printing session id 
		return new ResponseEntity<>("Deepak is a future Businessman , he gets all details of American Barbers shop"+id, HttpStatus.OK);
	}

}
