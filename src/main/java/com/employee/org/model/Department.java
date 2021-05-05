package com.employee.org.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Department")
public class Department {
    @Id
    @Column(name = "dept_no")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_generator")
    @SequenceGenerator(name="department_generator", sequenceName = "department_seq", allocationSize = 1)
    int departmentNo;

    @Column(name = "department_name")
    String departmentName;
    @Column(name = "department_id")
    String departmentID;


}
