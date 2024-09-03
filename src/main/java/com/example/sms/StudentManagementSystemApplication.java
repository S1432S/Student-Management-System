package com.example.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}
