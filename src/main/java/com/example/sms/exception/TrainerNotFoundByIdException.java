package com.example.sms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TrainerNotFoundByIdException extends RuntimeException
{
	private String message;


	
	
}
