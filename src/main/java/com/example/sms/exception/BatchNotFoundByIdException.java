package com.example.sms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BatchNotFoundByIdException extends RuntimeException
{
	private String message;


	
	
}
