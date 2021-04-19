package com.employee.org.service;

import com.employee.org.model.Employee;
import com.employee.org.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
       employee.setEName(employee.getEName().toUpperCase());
        employeeRepository.addEmployee(employee);
       // System.out.println(employee);
    }

    /*public Employee getEmployee(Employee employee) {

        return employeeRepository.getEmployee(employee);
    }*/

    public Employee getEmployee(Integer employeeId) {

        return employeeRepository.getEmployee(employeeId);

    }

    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee);
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteEmployee(employeeId);
    }

    public List<Employee> getAllEmployee() {
      return  employeeRepository.getAllEmployee();
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findByLocation(String location) {
        return employeeRepository.findByLoction(location);
    }
}
