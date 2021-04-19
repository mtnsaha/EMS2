package com.employee.org.model;


import lombok.*;

import javax.persistence.*;
//http://localhost:8080/h2-console

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table
public class Employee {


    @Column(name = "EMPLOYEE_NAME")
    String eName;
    @Id
    @GeneratedValue
    @Column(name="EMPLOYEE_ID")
    int eId;
    @Column(name="EMPLOYEE_LOCATION")
    String eLocation;
    @Column(name= "EMPLOYEE_MOBILE")
    String eMobile;


}
