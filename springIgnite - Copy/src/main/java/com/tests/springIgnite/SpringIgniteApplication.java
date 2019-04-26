package com.tests.springIgnite;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tests.springIgnite.config.SpringDataConfig;
import com.tests.springIgnite.entity.EmployeeDTO;
import com.tests.springIgnite.repository.EmployeeRepository;


public class SpringIgniteApplication {
	
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.register(SpringDataConfig.class);
	        context.refresh();

	        EmployeeRepository repository = context.getBean(EmployeeRepository.class);

	        EmployeeDTO employeeDTO = new EmployeeDTO();
	        employeeDTO.setId(1);
	        employeeDTO.setName("John");
	        employeeDTO.setEmployed(true);

	        repository.save(employeeDTO.getId(), employeeDTO);

	        EmployeeDTO employee = repository.getEmployeeDTOById(employeeDTO.getId());
	        System.out.println(employee);

	}

}
