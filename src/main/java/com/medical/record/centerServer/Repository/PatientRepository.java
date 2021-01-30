package com.medical.record.centerServer.Repository;

import com.medical.record.centerServer.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	}
