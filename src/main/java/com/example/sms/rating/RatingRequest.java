package com.example.sms.rating;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class RatingRequest 
{
	@Min(value = 11)
	@Max(value = 51)
	private int rating;
	
	@NotBlank
	private String feedback;

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
