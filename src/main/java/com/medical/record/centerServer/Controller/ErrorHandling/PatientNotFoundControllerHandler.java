package com.medical.record.centerServer.Controller.ErrorHandling;

import com.medical.record.centerServer.Models.Error.ErrorHandle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ControllerAdvice
public class PatientNotFoundControllerHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(PatientNotFoundController.class)
	public final ResponseEntity<Object> handlePatientNotFound(Exception e) {
		List<String> details = new ArrayList<>();
		details.add(e.getLocalizedMessage());
		ErrorHandle errorHandle = new ErrorHandle(new Date(), "Patient Not Found", details);
		return new ResponseEntity<>(errorHandle, HttpStatus.NOT_FOUND);
	}
}
