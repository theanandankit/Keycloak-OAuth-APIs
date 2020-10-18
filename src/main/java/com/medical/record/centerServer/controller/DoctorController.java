package com.medical.record.centerServer.controller;

import com.medical.record.centerServer.entity.Doctor;
import com.medical.record.centerServer.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/doctor")
	public Doctor setDoctor(){
		Doctor doctor=new Doctor();
		doctor.setName("Ankit");
		doctor.setAge(20);
		return doctorService.save(doctor);
	}
}
