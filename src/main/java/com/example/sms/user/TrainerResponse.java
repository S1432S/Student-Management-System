package com.example.sms.user;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainerResponse extends UserResponse
{
//	public List<Subject> getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(List<Subject> subjects) {
//		this.subjects = subjects;
//	}

	private List<Subject> subjects;
	
	
}
