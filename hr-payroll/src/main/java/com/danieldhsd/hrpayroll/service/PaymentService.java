package com.danieldhsd.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.danieldhsd.hrpayroll.model.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
