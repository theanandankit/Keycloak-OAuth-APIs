package com.medical.record.centerServer.controller;

import com.medical.record.centerServer.entity.Patient;
import com.medical.record.centerServer.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/patient")
	public Patient patient(){
		Patient patient = new Patient();
		System.out.println("ankit");
		patient.setAge(20);
		patient.setName("ankit");
		return patientService.addPatient(patient);
	}
}
