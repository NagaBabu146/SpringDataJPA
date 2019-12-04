package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeDTO implements Serializable {

	private int id;
	private String name;
	private String adress;
	private Double salary;
}
