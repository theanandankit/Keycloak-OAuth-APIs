package com.medical.record.centerServer.service;

import com.medical.record.centerServer.entity.Patient;
import com.medical.record.centerServer.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;

	public Patient addPatient(Patient patient){
		return repository.save(patient);
	}
}
