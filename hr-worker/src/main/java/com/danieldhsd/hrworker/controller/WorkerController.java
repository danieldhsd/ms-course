package com.danieldhsd.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieldhsd.hrworker.model.Worker;
import com.danieldhsd.hrworker.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	@Autowired
	private WorkerService workerService;

	@GetMapping
	public List<Worker> findAll() {
		return workerService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Worker findById(@PathVariable Long id) {
		return workerService.findById(id);
	}
}
