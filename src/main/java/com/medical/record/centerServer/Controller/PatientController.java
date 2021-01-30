package com.medical.record.centerServer.Controller;

import com.medical.record.centerServer.Entity.Patient;
import com.medical.record.centerServer.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PatientController extends RuntimeException {

	@Autowired
	private PatientService patientService;

	@PostMapping("/Patient/add")
	public Patient patient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}

	@GetMapping("/patient/{id}")
	public Patient getPatient(@PathVariable int id , HttpServletResponse httpServletResponse) {
		Patient patient = patientService.getPatient(id);

			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/patient/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.update(patient);
	}

	@GetMapping("/patient/remove/{id}")
	public String removePatient(@PathVariable int id) {
		return patientService.removePatient(id);
	}
}
