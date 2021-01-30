package com.medical.record.centerServer.Controller;

import com.medical.record.centerServer.Entity.Doctor;
import com.medical.record.centerServer.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
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
