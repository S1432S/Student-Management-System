package com.example.sms.user;

import java.time.Year;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest extends UserRequest
{
	private String degree;
	private String stream;
	private Year   yop;
	private double degreePercentage;
	private double tenthPercentage;
	private double twelvethPercentage;
	
	
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
	
	
}
