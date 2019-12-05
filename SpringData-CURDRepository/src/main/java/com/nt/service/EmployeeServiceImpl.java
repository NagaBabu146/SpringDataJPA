package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String registerEmployee(EmployeeDTO dto) {

		Employee empEntity = null;
		Employee empEntity1 = null;

		// convert DTO to BO/Entity
		empEntity = new Employee();
		BeanUtils.copyProperties(dto, empEntity);

		// use Repository
		empEntity1 = empRepo.save(empEntity);

		if (empEntity1 != null)
			return "employee is  registered successsfully" + empEntity1.getId();
		else
			return "employee is not registered";
	}

}
