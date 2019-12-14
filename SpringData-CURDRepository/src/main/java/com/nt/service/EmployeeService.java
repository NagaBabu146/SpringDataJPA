package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {

	public String registerEmployee(EmployeeDTO dto);
	public List<EmployeeDTO> getAllEmployees();
	public EmployeeDTO fetchEmployeeById(int id);
}
