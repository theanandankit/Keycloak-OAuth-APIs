package com.medical.record.centerServer.controller;

import com.medical.record.centerServer.entity.Doctor;
import com.medical.record.centerServer.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@PostMapping("/doctor/add")
	public Doctor setDoctor(@RequestBody Doctor doctor){
		return doctorService.save(doctor);
	}
}
