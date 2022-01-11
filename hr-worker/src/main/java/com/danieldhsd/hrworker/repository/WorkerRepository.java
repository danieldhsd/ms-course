package com.danieldhsd.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieldhsd.hrworker.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
