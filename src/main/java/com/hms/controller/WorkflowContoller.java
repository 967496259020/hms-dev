package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.hms.entity.AddMember;
import com.hms.service.WorkflowService;

@RestController
@RequestMapping("/hms/workflow")
@CrossOrigin(origins = {"http://localhost:3000"})
public class WorkflowContoller {

	@Autowired
	private WorkflowService workflowservice;
	
	@PostMapping(value = "/addMember" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public AddMember saveMember(@RequestBody AddMember addMember) {
		
	 return workflowservice.saveMember(addMember);
		
	}

@GetMapping(value = "/test" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getTest() {
		
	 return "String";
		
	}

}