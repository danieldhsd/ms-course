package com.danieldhsd.hrpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieldhsd.hrpayroll.model.Payment;
import com.danieldhsd.hrpayroll.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{days}")
	public Payment getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		return paymentService.getPayment(workerId, days);
	}
	
	public Payment getPaymentAlternative(Long workerId, Integer days) {
		return new Payment("Brann", 400.0, days);
	}
}
