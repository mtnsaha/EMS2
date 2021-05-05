package com.employee.org.controller;


import com.employee.org.model.Employee;
import com.employee.org.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Scope("request")
@CrossOrigin("*")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {
        log.debug("i am logg debug");
        log.info("add employee started having employee name as "+ employee.getEmployeeName());
        employeeService.addEmployee(employee);
        log.info("add employee ended");
    }

   /* @GetMapping("/getEmployee")
    public Employee getEmployee(@RequestParam Employee employee) {
        return employeeService.getEmployee(employee);

    }*/

    @GetMapping("/getEmployee")
    public Employee getEmployee(@RequestParam Integer employeeId) {
        return employeeService.getEmployee(employeeId);

    }
    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestParam Integer employeeId)
    {
        employeeService.deleteEmployee(employeeId);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/byName")
    public List<Employee> findByName(@RequestParam String name)
    {
        return employeeService.findByName(name);
    }
    @GetMapping("/byLocation")
    public List<Employee> findByLocation(@RequestParam String location)
    {
        return employeeService.findByLocation(location);
    }

}
