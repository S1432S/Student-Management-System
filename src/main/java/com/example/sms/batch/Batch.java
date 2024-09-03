package com.example.sms.batch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.sms.config.GenerateSequenceId;
import com.example.sms.user.Student;
import com.example.sms.user.Subject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "batches")
public class Batch
{
	@Id
	@GenerateSequenceId
	@Column(name = "batch_id")
	private String batchid;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "subjects")
	private List<Subject> subjects;
	
	@Column(name = "starting_date")
	private LocalDate startingdate;
	
	@Column(name = "closed_date")
	private LocalDate closeddate;
	
	@Column(name = "begains_at")
	private LocalTime begainsAt;
	
	@Column(name = "ends_at")
	private LocalTime endsAt;
	
	@Column(name = "batch_status")
	@Enumerated(EnumType.STRING)
	private BatchStatus batchstatus;
	
	@ManyToMany
	private List<Student> students;

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

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

	public LocalDate getStartingdate() {
		return startingdate;
	}

	public void setStartingdate(LocalDate startingdate) {
		this.startingdate = startingdate;
	}

	public LocalDate getCloseddate() {
		return closeddate;
	}

	public void setCloseddate(LocalDate closeddate) {
		this.closeddate = closeddate;
	}

	public LocalTime getBegainsAt() {
		return begainsAt;
	}

	public void setBegainsAt(LocalTime begainsAt) {
		this.begainsAt = begainsAt;
	}

	public LocalTime getEndsAt() {
		return endsAt;
	}

	public void setEndsAt(LocalTime endsAt) {
		this.endsAt = endsAt;
	}

	public BatchStatus getBatchstatus() {
		return batchstatus;
	}

	public void setBatchstatus(BatchStatus batchstatus) {
		this.batchstatus = batchstatus;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	
}
