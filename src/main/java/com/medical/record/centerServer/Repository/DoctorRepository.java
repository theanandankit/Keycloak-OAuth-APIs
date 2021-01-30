package com.medical.record.centerServer.Repository;

import com.medical.record.centerServer.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
