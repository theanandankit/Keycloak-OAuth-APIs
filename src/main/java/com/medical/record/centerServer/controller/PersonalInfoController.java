package com.medical.record.centerServer.controller;

import com.medical.record.centerServer.entity.PersonalInfo;
import com.medical.record.centerServer.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfoController {

	@Autowired
	private PersonalInfoService personalInfoService;

	@PostMapping("/personalInfo/add")
	public PersonalInfo add(@RequestBody PersonalInfo personalInfo){
		System.out.println("ankit");
		return personalInfoService.save(personalInfo);
	}

	@PostMapping("/personalInfo/update")
	public PersonalInfo update(@RequestBody PersonalInfo personalInfo){
		return personalInfoService.update(personalInfo);
	}
}
