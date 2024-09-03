package com.example.sms.batch;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.sms.user.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchResponse
{

		private String batchId;
		private String title;
		
		
		private List<Subject> subjects;
		
		private LocalDate startingDate;
		private LocalDate closedDate;
		private LocalTime beginsAt;
		
		private LocalTime endsAt;
		private BatchStatus batchStatus;
		public String getBatchId() {
			return batchId;
		}
		public void setBatchId(String batchId) {
			this.batchId = batchId;
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
		public LocalDate getStartingDate() {
			return startingDate;
		}
		public void setStartingDate(LocalDate startingDate) {
			this.startingDate = startingDate;
		}
		public LocalDate getClosedDate() {
			return closedDate;
		}
		public void setClosedDate(LocalDate closedDate) {
			this.closedDate = closedDate;
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
		public BatchStatus getBatchStatus() {
			return batchStatus;
		}
		public void setBatchStatus(BatchStatus batchStatus) {
			this.batchStatus = batchStatus;
		}
		
		
}
