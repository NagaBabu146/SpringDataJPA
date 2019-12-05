package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value = AppConfig.class)
public class SpringDataCurdRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		EmployeeService service = null;
		System.out.println("welcome");

		EmployeeDTO dto = null;
		// get IOC Container
		context = SpringApplication.run(SpringDataCurdRepositoryApplication.class, args);
		// get bean
		service = context.getBean("empService", EmployeeService.class);
		try {
			// create EmployeeDTO

			dto = new EmployeeDTO();
			// dto.setId(101);
			dto.setName("vasu");
			dto.setAdress("bangalore");
			dto.setSalary(25000.50);
			// invoke b.method
			service.registerEmployee(dto);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
