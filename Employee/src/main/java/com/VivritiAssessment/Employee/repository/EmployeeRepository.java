package com.VivritiAssessment.Employee.repository;

import com.VivritiAssessment.Employee.model.Employeedetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employeedetails, Long> {
}
