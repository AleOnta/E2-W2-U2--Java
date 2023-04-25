package com.web_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.thymeleaf.exceptions.TemplateInputException;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(TemplateInputException.class)
	ResponseEntity<String> manageTemplateInputException(TemplateInputException e) {
		return new ResponseEntity<String>(e.getMessage() + "CustomExceptionHandler!", HttpStatus.NOT_IMPLEMENTED);
	}
}
