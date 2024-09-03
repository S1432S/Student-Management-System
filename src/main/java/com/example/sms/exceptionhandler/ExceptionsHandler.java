package com.example.sms.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.sms.exception.BatchNotFoundByIdException;
import com.example.sms.exception.RatingNotFoundByIdException;
import com.example.sms.exception.StudentNotFoundByIdException;
import com.example.sms.exception.TrainerNotFoundByIdException;
import com.example.sms.util.AppResponseBuilder;
import com.example.sms.util.ErrorStructure;

import lombok.AllArgsConstructor;

@RestControllerAdvice
@AllArgsConstructor
public class ExceptionsHandler
{
	private AppResponseBuilder responsebuilder;
	
	@ExceptionHandler(value = TrainerNotFoundByIdException.class)
	public ResponseEntity<ErrorStructure<String>> handleTrainerNotFoundByIdException(TrainerNotFoundByIdException ex){
		return responsebuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(), "failed to find the Trainer with the Id");
	}
	@ExceptionHandler(value = StudentNotFoundByIdException.class)
	public ResponseEntity<ErrorStructure<String>> handleStudentNotFoundByIdException(StudentNotFoundByIdException ex){
		return responsebuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(), "failed to find the Student with the Id");
	}
	
	@ExceptionHandler(value = RatingNotFoundByIdException.class)
	public ResponseEntity<ErrorStructure<String>> handleRatingNotFoundByIdException(RatingNotFoundByIdException ex){
		return responsebuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(), "failed to find the rating with the id");
	}
	
	@ExceptionHandler(value = BatchNotFoundByIdException.class)
	public ResponseEntity<ErrorStructure<String>> handleBatchNotFoundByIdException(BatchNotFoundByIdException ex){
		return responsebuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(), "failed to find the batch with the id");
	}
}
