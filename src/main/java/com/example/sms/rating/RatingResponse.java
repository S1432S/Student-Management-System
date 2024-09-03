package com.example.sms.rating;

import com.example.sms.user.Subject;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class RatingResponse 
{
	private Subject subject;
	private int rating;
	private String feedback;
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
