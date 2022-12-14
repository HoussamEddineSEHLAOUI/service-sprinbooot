package com.projectsb.employee;

import com.projectsb.employee.modals.Employee;
import com.projectsb.employee.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.projectsb.employee.controllers")).build();
	}
	@Bean
	CommandLineRunner start(EmployeeRepository employeeRepository){
		return args -> {
			Employee e1 = new Employee(null, "Houssam","SEHLAOUI");
			Employee e2 = new Employee(null, "amine", "amine");
			employeeRepository.save(e1);
			employeeRepository.save(e2);
		};
	}

}
