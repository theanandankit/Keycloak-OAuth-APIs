package com.medical.record.centerServer.repository;

import com.medical.record.centerServer.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
