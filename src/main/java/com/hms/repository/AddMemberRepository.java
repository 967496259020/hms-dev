package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.AddMember;

public interface AddMemberRepository extends JpaRepository<AddMember, Long> {

}
