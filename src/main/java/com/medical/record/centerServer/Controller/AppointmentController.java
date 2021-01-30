package com.medical.record.centerServer.Controller;

import com.medical.record.centerServer.Entity.Appointment;
import com.medical.record.centerServer.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;

	@PostMapping("/appointment/add")
	public Appointment add(@RequestBody Appointment appointment){
		return appointmentService.save(appointment);
	}
}
