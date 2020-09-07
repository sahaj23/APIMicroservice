package com.javatechie.spring.mongo.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.javatechie.spring.mongo.api.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

	@Query(value="{'id' : ?0}")
	public Optional<Employee> findById (String id);
}
