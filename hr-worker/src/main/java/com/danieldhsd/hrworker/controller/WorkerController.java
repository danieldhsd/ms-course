package com.danieldhsd.hrworker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieldhsd.hrworker.model.Worker;
import com.danieldhsd.hrworker.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService workerService;

	@GetMapping
	public List<Worker> findAll() {
		return workerService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Worker findById(@PathVariable Long id) {
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		return workerService.findById(id);
	}
}
