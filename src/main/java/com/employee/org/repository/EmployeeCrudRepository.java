package com.employee.org.repository;

import com.employee.org.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*

@Repository
public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findByeName(String name);
    List<Employee> findByeLocation(String location);
}
*/


public interface EmployeeCrudRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByemployeeName(String name);
    List<Employee> findByemployeeLocation(String location);

}
