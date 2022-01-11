package com.danieldhsd.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldhsd.hrpayroll.feignclients.WorkerFeignClient;
import com.danieldhsd.hrpayroll.model.Payment;
import com.danieldhsd.hrpayroll.model.Worker;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId); 
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
