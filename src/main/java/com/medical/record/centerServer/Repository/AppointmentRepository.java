package com.medical.record.centerServer.Repository;

import com.medical.record.centerServer.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

}
