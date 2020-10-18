package com.medical.record.centerServer.repository;

import com.medical.record.centerServer.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	}
