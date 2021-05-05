package com.employee.org.repository;
import com.employee.org.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository{
    @Autowired
    EmployeeCrudRepository employeeCrudRepository;

    public void addEmployee(Employee employee) {
        employeeCrudRepository.save(employee);

    }

    /*public Employee getEmployee(Employee employee) {
    return employeeCrudRepository.findById(employee.getEId()).orElse(new Employee());
    }*/

    public Employee getEmployee(Integer employeeId) {
        return employeeCrudRepository.findById(employeeId).orElse(new Employee());
    }

    public void updateEmployee(Employee employee) {
        employeeCrudRepository.save(employee);
    }

    public void deleteEmployee(Integer employeeId) {
        employeeCrudRepository.deleteById(employeeId);
    }

    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeCrudRepository.findAll();
    }

    public List<Employee> findByName(String name) {
        return employeeCrudRepository.findByemployeeName(name);
    }

    public List<Employee> findByLocation(String location) {
    return employeeCrudRepository.findByemployeeLocation(location);
    }
}
