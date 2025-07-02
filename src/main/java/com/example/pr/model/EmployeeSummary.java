package com.example.pr.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployeeSummary {
  private Long id;
  private String name;
  private String department;

  public EmployeeSummary(String name, String department, Long id) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

}

