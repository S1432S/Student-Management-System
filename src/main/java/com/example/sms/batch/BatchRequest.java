package com.example.sms.batch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.sms.user.Subject;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchRequest 
{
	@NotNull
	@NotBlank(message = "Name should be given for the batch")
	@Pattern(regexp = "^[A-Za-z0-9-]+$")
	private String title;
	
	
	private List<Subject> subjects;
	
	private LocalDate startingDate;
	
	private LocalTime beginsAt;
	
	private LocalTime endsAt;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalTime getBeginsAt() {
		return beginsAt;
	}

	public void setBeginsAt(LocalTime beginsAt) {
		this.beginsAt = beginsAt;
	}

	public LocalTime getEndsAt() {
		return endsAt;
	}

	public void setEndsAt(LocalTime endsAt) {
		this.endsAt = endsAt;
	}
	
	
}
