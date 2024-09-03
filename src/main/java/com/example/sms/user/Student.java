package com.example.sms.user;

import java.time.Year;
import java.util.List;

import com.example.sms.batch.Batch;
import com.example.sms.rating.Rating;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student extends User
{
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "stream")
	private String stream;
	
	@Column(name = "yop")
	private Year   yop;
	
	@Column(name = "degree_percentage")
	private double degreePercentage;
	
	@Column(name = "tenth_percentage")
	private double tenthPercentage;
	
	@Column(name = "twelveth_percentage")
	private double twelvethPercentage;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "stacks")
	private Stack stack;
	
	@Column(name = "ratings")
	@OneToMany(mappedBy = "student",cascade = CascadeType.REMOVE)
	private List<Rating> ratings;
	
	@Column(name = "batches")
	@ManyToMany(mappedBy = "students")
	private List<Batch> batches;

//	public String getDegree() {
//		return degree;
//	}
//
//	public void setDegree(String degree) {
//		this.degree = degree;
//	}
//
//	public String getStream() {
//		return stream;
//	}
//
//	public void setStream(String stream) {
//		this.stream = stream;
//	}
//
//	public Year getYop() {
//		return yop;
//	}
//
//	public void setYop(Year yop) {
//		this.yop = yop;
//	}
//
//	public double getDegreePercentage() {
//		return degreePercentage;
//	}
//
//	public void setDegreePercentage(double degreePercentage) {
//		this.degreePercentage = degreePercentage;
//	}
//
//	public double getTenthPercentage() {
//		return tenthPercentage;
//	}
//
//	public void setTenthPercentage(double tenthPercentage) {
//		this.tenthPercentage = tenthPercentage;
//	}
//
//	public double getTwelvethPercentage() {
//		return twelvethPercentage;
//	}
//
//	public void setTwelvethPercentage(double twelvethPercentage) {
//		this.twelvethPercentage = twelvethPercentage;
//	}
//
//	public Stack getStack() {
//		return stack;
//	}
//
//	public void setStack(Stack stack) {
//		this.stack = stack;
//	}
//
//	public List<Rating> getRatings() {
//		return ratings;
//	}
//
//	public void setRatings(List<Rating> ratings) {
//		this.ratings = ratings;
//	}
//
//	public List<Batch> getBatches() {
//		return batches;
//	}
//
//	public void setBatches(List<Batch> batches) {
//		this.batches = batches;
//	}
//	
	
	
}
