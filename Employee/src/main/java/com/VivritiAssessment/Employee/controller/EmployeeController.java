package com.VivritiAssessment.Employee.controller;
import com.VivritiAssessment.Employee.model.Employeedetails;
import com.VivritiAssessment.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/products")
    public ResponseEntity<List<Employeedetails>> getAllEmployees(){
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }
    @PostMapping("/products")
    public ResponseEntity<Employeedetails> createEmployee(@RequestBody Employeedetails employeedetails){
        return ResponseEntity.ok().body(this.employeeService.createEmployee(employeedetails));
    }
    @PutMapping("/products/{id}")
    public ResponseEntity<Employeedetails> updateEmployee(@PathVariable long id, @RequestBody Employeedetails employeedetails){
        employeedetails.setUserId((int) id);
        return ResponseEntity.ok().body(this.employeeService.updateEmployee(employeedetails));
    }
    @DeleteMapping("/products/{id}")
    public HttpStatus deleteEmployee(@PathVariable long id){
        this.employeeService.deleteEmployee((int) id);
        return HttpStatus.OK;
    }
}
