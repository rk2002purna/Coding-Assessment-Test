package com.VivritiAssessment.Employee.service;
import com.VivritiAssessment.Employee.exception.ResourceNotFoundException;
import com.VivritiAssessment.Employee.model.Employeedetails;
import com.VivritiAssessment.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeSreviceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employeedetails createEmployee(Employeedetails employeedetails) {
        return employeeRepository.save(employeedetails);
    }
    @Override
    public Employeedetails updateEmployee(Employeedetails employeedetails) {
        Optional<Employeedetails> employeeDb = this.employeeRepository.findById( employeedetails.getUserId());
        if(employeeDb.isPresent()) {
            Employeedetails employeeUpdate = employeeDb.get();
            employeeUpdate.setUserId(employeedetails.getUserId());
            employeeUpdate.setFirstName(employeedetails.getFirstName());
            employeeUpdate.setLastName(employeedetails.getLastName());
            employeeUpdate.setMobileNumber(employeedetails.getMobileNumber());
            employeeUpdate.setAddress(employeedetails.getAddress());
            employeeUpdate.setDepartment(employeedetails.getDepartment());
            employeeRepository.save(employeeUpdate);
            return employeeUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + employeedetails.getUserId());
        }
    }
    @Override
    public List<Employeedetails> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(long userId) {
        Optional<Employeedetails> employeeDb = this.employeeRepository.findById(userId);

        if(employeeDb.isPresent()) {
            this.employeeRepository.delete(employeeDb.get());
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + userId);
        }


    }





}
