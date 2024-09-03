package com.example.sms.rating;

import org.springframework.stereotype.Component;

@Component
public class RatingMapper 
{
	public Rating mapToRating(RatingRequest ratingRequest, Rating rating) {
		rating.setRating(ratingRequest.getRating());
		rating.setFeedback(ratingRequest.getFeedback());
		return rating;
	}
	
	public RatingResponse mapToRatingResponse(Rating rating) {
		RatingResponse ratingResponse=new RatingResponse();
		ratingResponse.setRating(rating.getRating());
		ratingResponse.setFeedback(rating.getFeedback());
		ratingResponse.setSubject(rating.getSubject());
		return ratingResponse;
	}
}
