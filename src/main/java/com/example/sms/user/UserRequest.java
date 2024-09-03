package com.example.sms.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest 
{
	@NotNull(message = "user_name cannot be null")
	@Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9_-]{2,19}$")
	private String  username;
	
	@NotNull(message = "email cannot be null")
	@Email(regexp ="^[a-zA-Z0-9._%+-]+@gmail\\.com$" )
	private String email;

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	
}
