package com.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.AddMember;
import com.hms.repository.AddMemberRepository;

@Service
public class WorkflowService {

	@Autowired
	private AddMemberRepository addMemberRepository;
	
	public AddMember saveMember(AddMember addMember) {
		return addMemberRepository.save(addMember);
	}

}
