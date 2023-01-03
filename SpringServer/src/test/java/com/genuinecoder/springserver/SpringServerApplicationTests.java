package com.genuinecoder.springserver;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.genuinecoder.springserver.model.employee.Employee;
import com.genuinecoder.springserver.model.employee.EmployeeDao;

@SpringBootTest
class SpringServerApplicationTests {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Genuine coder");
		employee.setLocation("Building-6");
		employee.setBranch("IT");
		employeeDao.save(employee);
	}

	//@Test
	void getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		System.out.println(employees);
		for(Employee employee: employees) {
			employeeDao.delete(employee.getId());
		}
	}
}
