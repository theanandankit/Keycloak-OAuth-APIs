package com.medical.record.centerServer.service;

import com.medical.record.centerServer.entity.Doctor;
import com.medical.record.centerServer.entity.Patient;
import com.medical.record.centerServer.repository.DoctorRepository;
import com.medical.record.centerServer.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;
	@Autowired
	private DoctorRepository doctorRepository;

	public Patient addPatient(Patient patient){
		return repository.save(patient);
	}

	public String removePatient(int a){
		repository.deleteById(a);
		return "removed";
	}

	public Patient update(Patient temp){
		Patient patient = repository.findById(temp.getId()).orElse(temp);
		patient.setName(temp.getName());
		patient.setAge(temp.getAge());
		return repository.save(patient);
	}

	public Patient getPatient(int id){
		return repository.findById(id).orElse(null);
	}
}
