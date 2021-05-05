package com.employee.org.model;


import lombok.*;

import javax.persistence.*;
//http://localhost:8080/h2-console

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {


    @Column(name = "employee_name")
    String employeeName;
    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name="employee_generator", sequenceName = "employee_seq", allocationSize = 1)
    int employeeId;
    @Column(name="employee_location")
    String employeeLocation;
    @Column(name= "employee_phone_no")
    String employeeMobile;
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "DEPT_NO")
    //Department department;

    @Transient
    String departmentName;

    @Column(name = "dept_no")
    int departmentNo;

}
