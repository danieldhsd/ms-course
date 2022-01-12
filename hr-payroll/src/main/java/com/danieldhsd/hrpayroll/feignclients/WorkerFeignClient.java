package com.danieldhsd.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.danieldhsd.hrpayroll.model.Worker;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}")
	Worker findById(@PathVariable Long id);
}
