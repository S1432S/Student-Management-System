package com.example.sms.batch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<Batch, String>
{
	
}
