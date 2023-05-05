package ru.skypro.homework.springboot.hw_springboot.repository;

import ru.skypro.homework.springboot.hw_springboot.employee.Employee;

import java.util.List;

public interface EmployeeRepository {

    int getSumAllEmployee();

    Employee getEmployeeMinSalary();

    Employee getEmployeeMaxSalary();

    List<Employee> getAllEmployeeHaveSalaryUpAverage();
}
