package com.medical.record.centerServer.repository;

import com.medical.record.centerServer.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

}
