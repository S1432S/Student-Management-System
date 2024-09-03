package com.example.sms.user;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.sms.config.GenerateSequenceId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@EntityListeners(AuditingEntityListener.class)
public class User 
{
	@Id
	@GenerateSequenceId
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "user_email")
	private String email;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "user_role")
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@LastModifiedDate
	@Column(name = "modified_at")
	private LocalDateTime modifiedAt;

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public UserRole getRole() {
//		return role;
//	}
//
//	public void setRole(UserRole role) {
//		this.role = role;
//	}
//
//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public LocalDateTime getModifiedAt() {
//		return modifiedAt;
//	}
//
//	public void setModifiedAt(LocalDateTime modifiedAt) {
//		this.modifiedAt = modifiedAt;
//	}
	
	
}
