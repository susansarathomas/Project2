package com.controller;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Feedback;
import com.service.AppService;


@RestController
public class MyRestApp {

	@Autowired
	private AppService service;
	
	@PostMapping("/feedback")
	public String userRegister(@RequestParam("name") String name, @RequestParam ("email") String email,@RequestParam Date date,@RequestParam ("subject")String subject,@RequestParam ("message") String message){
		Feedback e = new Feedback(name,email,date,subject, message);
			boolean data = service.addUser(e);
			
			if(data){
			return "Feedback Added Successfully";
			}
			else{
			return "Feedback Not Added Successfully";
	}
	}
	
}
