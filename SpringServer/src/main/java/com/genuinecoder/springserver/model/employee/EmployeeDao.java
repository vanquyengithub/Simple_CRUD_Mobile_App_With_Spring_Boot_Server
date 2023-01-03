package com.genuinecoder.springserver.model.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		 return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		Streamable.of(employeeRepository.findAll())
		.forEach(employees::add);
		return employees;
	}
	
	public void delete(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}
}
