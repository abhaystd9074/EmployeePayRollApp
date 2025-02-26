package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
// repository
public interface EmployeePayrollRepository extends JpaRepository<Employee, Long> {
}
