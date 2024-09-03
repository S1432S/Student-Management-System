package com.example.sms.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorStructure<T>
{
	private int status;
	private String message;
	private T rootcause;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getRootcause() {
		return rootcause;
	}



	public void setRootcause(T rootcause) {
		this.rootcause = rootcause;
	}



	public static <T> ErrorStructure<T> error(int status,String message, T rootCause){
		ErrorStructure<T> error=new ErrorStructure<>();
		error.setStatus(status);
		error.setMessage(message);
		error.setRootcause(rootCause);
		return error;
	}
}
