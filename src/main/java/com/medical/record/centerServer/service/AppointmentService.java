package com.medical.record.centerServer.service;

import com.medical.record.centerServer.entity.Appointment;
import com.medical.record.centerServer.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	public Appointment save(Appointment appointment){
		return appointmentRepository.save(appointment);
	}

	public Appointment get(int id){
		return appointmentRepository.findById(id).orElse(null);
	}

}
