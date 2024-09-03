package com.example.sms.user;

import java.time.Year;
import java.util.List;

import com.example.sms.rating.Rating;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse extends UserResponse
{
	private String degree;
	private String stream;
	private Year   yop;
	private double degreePercentage;
	private double tenthPercentage;
	private double twelvethPercentage;
	private Stack stack;
	private List<Rating> ratings;
	private UserRole role;
	
	
//	public String getDegree() {
//		return degree;
//	}
//	public void setDegree(String degree) {
//		this.degree = degree;
//	}
//	public String getStream() {
//		return stream;
//	}
//	public void setStream(String stream) {
//		this.stream = stream;
//	}
//	public Year getYop() {
//		return yop;
//	}
//	public void setYop(Year yop) {
//		this.yop = yop;
//	}
//	public double getDegreePercentage() {
//		return degreePercentage;
//	}
//	public void setDegreePercentage(double degreePercentage) {
//		this.degreePercentage = degreePercentage;
//	}
//	public double getTenthPercentage() {
//		return tenthPercentage;
//	}
//	public void setTenthPercentage(double tenthPercentage) {
//		this.tenthPercentage = tenthPercentage;
//	}
//	public double getTwelvethPercentage() {
//		return twelvethPercentage;
//	}
//	public void setTwelvethPercentage(double twelvethPercentage) {
//		this.twelvethPercentage = twelvethPercentage;
//	}
//	public Stack getStack() {
//		return stack;
//	}
//	public void setStack(Stack stack) {
//		this.stack = stack;
//	}
//	public List<Rating> getRatings() {
//		return ratings;
//	}
//	public void setRatings(List<Rating> ratings) {
//		this.ratings = ratings;
//	}
//	public UserRole getRole() {
//		return role;
//	}
//	public void setRole(UserRole role) {
//		this.role = role;
//	}
	
	
}
