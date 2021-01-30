package com.medical.record.centerServer.service;

import com.medical.record.centerServer.Entity.Doctor;
import com.medical.record.centerServer.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor save(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor update(Doctor temp) {
		Doctor doctor = doctorRepository.findById(temp.getId()).orElse(null);
		if (doctor != null) {
			doctor.setName(temp.getName());
			doctor.setAge(temp.getAge());
			return doctorRepository.save(doctor);
		}
		return null;
	}
}
