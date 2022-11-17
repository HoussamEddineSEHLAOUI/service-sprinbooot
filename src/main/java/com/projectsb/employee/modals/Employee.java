package com.projectsb.employee.modals;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Document("Employee")
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
