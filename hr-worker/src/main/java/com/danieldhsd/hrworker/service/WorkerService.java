package com.danieldhsd.hrworker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldhsd.hrworker.model.Worker;
import com.danieldhsd.hrworker.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> findAll() {
		return workerRepository.findAll();
	}
	
	public Worker findById(Long idWorker) {
		return workerRepository.findById(idWorker).orElseThrow();
	}

}
