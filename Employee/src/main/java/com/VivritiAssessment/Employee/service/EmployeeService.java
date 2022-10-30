package com.VivritiAssessment.Employee.service;
import com.VivritiAssessment.Employee.model.Employeedetails;
import java.util.List;

public interface EmployeeService {
    Employeedetails createEmployee(Employeedetails employee);

    Employeedetails updateEmployee(Employeedetails employee);

    List<Employeedetails> getAllEmployees();

    void deleteEmployee(long userId);
}
