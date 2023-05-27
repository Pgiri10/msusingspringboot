package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;

@RestController
public class RegController {

	@GetMapping("/allEmp")
	public List<Employee> getALLEmp() {
		List<Employee> empList = Arrays.asList(

				new Employee(1001, "pg", "gg"), new Employee(1002, "pg", "gg"), new Employee(1003, "pg", "gg"));

		return empList;

	}
}
