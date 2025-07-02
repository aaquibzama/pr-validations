package com.example.pr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
@NamedQuery(
    name = "Employee.getSummary",
    query = "SELECT new com.example.EmployeeSummary(e.id, e.name, e.department) FROM Employee e"
)
public class Employee {
  @Id
  private Long id;
  private String name;
  private String department;

}
