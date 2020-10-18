package com.medical.record.centerServer.service;

import com.medical.record.centerServer.entity.Doctor;
import com.medical.record.centerServer.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor save(Doctor doctor){
		return doctorRepository.save(doctor);
	}

}
