package com.example.sms.batch;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.sms.exception.BatchNotFoundByIdException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BatchService 
{
	private BatchRepository batchRepository;
	private BatchMapper batchMapper;
	
	public BatchResponse saveBatch(BatchRequest batchRequest) {
		Batch batch=batchMapper.mapToBatchEntity(batchRequest, new Batch());
		batch.setBatchstatus(BatchStatus.CREATED);
		batch =batchRepository.save(batch);
		return batchMapper.mapToBatchResponse(batch);
	}

	public BatchResponse updateBatchDetails(BatchRequest batchRequest, String batchId) {
		
		return batchRepository.findById(batchId).map(batch->{
			batchMapper.mapToBatchEntity(batchRequest, batch);
			batch=batchRepository.save(batch);
			return batchMapper.mapToBatchResponse(batch);
		}).orElseThrow(()->new BatchNotFoundByIdException("failed to find the object"));
	}

	public BatchResponse updateBatchStatusToCancel(String batchId) {
		
		return batchRepository.findById(batchId).map(batch->{
			batch.setBatchstatus(BatchStatus.CANCELLED);
			batch=batchRepository.save(batch);
			return batchMapper.mapToBatchResponse(batch);
		}).orElseThrow(()->new BatchNotFoundByIdException("failed to find the batch"));
				
	}

	public BatchResponse updateBatchStatusToClose(String batchId) {
		return batchRepository.findById(batchId).map(batch->{
			batch.setBatchstatus(BatchStatus.CLOSED);
			batch.setCloseddate(LocalDate.now());
			batchRepository.save(batch);
			return batchMapper.mapToBatchResponse(batch);
		}).orElseThrow(()-> new BatchNotFoundByIdException("failed to find the batch with id"));
		
	}
}
