package com.employee.org.service;

import com.employee.org.model.Department;
import com.employee.org.model.Employee;
import com.employee.org.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    EmployeeRepository employeeRepository;

    /*@Transactional
    public void addEmployee(Employee employee) {
        employee.setEmployeeName(employee.getEmployeeName().toUpperCase());
        String url="http://localhost:8090/getDepartment";
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.set(httpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        UriComponentsBuilder builder= UriComponentsBuilder.fromHttpUrl(url)
                                    .queryParam("departmentName",employee.getDepartmentName());
        HttpEntity entity= new HttpEntity(httpHeaders);
        ResponseEntity<Department> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, Department.class);
        Department department = response.getBody();
        employee.setDepartmentNo(department.getDepartmentNo());
        employeeRepository.addEmployee(employee);
        // System.out.println(employee);
    }*/

    @Transactional
    public void addEmployee(Employee employee) {
        employee.setEmployeeName(employee.getEmployeeName().toUpperCase());
        String url="http://localhost:8090/getDepartment";
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.set(httpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        Department department = new Department();
        department.setDepartmentName(employee.getDepartmentName());
        HttpEntity entity= new HttpEntity(httpHeaders);
        Department response = restTemplate.getForObject(url, Department.class, HttpMethod.POST, department, entity);
        employee.setDepartmentNo(department.getDepartmentNo());
        employeeRepository.addEmployee(employee);
        // System.out.println(employee);
    }

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
        return employeeRepository.getAllEmployee();
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findByLocation(String location) {
        return employeeRepository.findByLocation(location);
    }
}
