package com.example.sms.batch;

import org.springframework.stereotype.Component;

@Component
public class BatchMapper 
{
	public Batch mapToBatchEntity(BatchRequest batchRequest,Batch batch) {
		batch.setTitle(batchRequest.getTitle());
		batch.setSubjects(batchRequest.getSubjects());
		batch.setBegainsAt(batchRequest.getBeginsAt());
		batch.setEndsAt(batchRequest.getEndsAt());
		batch.setStartingdate(batchRequest.getStartingDate());
		return batch;
	}
	
	public BatchResponse mapToBatchResponse(Batch batch) {
		BatchResponse batchResponse=new BatchResponse();
		batchResponse.setBatchId(batch.getBatchid());
		batchResponse.setTitle(batch.getTitle());
		batchResponse.setSubjects(batch.getSubjects());
		batchResponse.setStartingDate(batch.getStartingdate());
		batchResponse.setClosedDate(batch.getCloseddate());
		batchResponse.setBeginsAt(batch.getBegainsAt());
		batchResponse.setEndsAt(batch.getEndsAt());
		batchResponse.setBatchStatus(batch.getBatchstatus());
		return batchResponse;
	}
}
