DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
employee_id INT AUTO_INCREMENT  PRIMARY KEY,
employee_name VARCHAR(50) NOT NULL,
employee_location VARCHAR(50) NOT NULL,
employee_mobile INT(10) NOT NULL
);