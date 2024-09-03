package com.example.sms.rating;

import com.example.sms.config.GenerateSequenceId;
import com.example.sms.user.Student;
import com.example.sms.user.Subject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ratings")
@Getter
@Setter
public class Rating 
{
	@Id
	@GenerateSequenceId
	@Column(name = "rating_id")
	private String ratingid;
	
	@Column(name = "subject")
	@Enumerated(EnumType.STRING)
	private Subject subject;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "feedback")
	private String feedback;
	
	@ManyToOne
	private Student student;

	public String getRatingid() {
		return ratingid;
	}

	public void setRatingid(String ratingid) {
		this.ratingid = ratingid;
	}

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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
