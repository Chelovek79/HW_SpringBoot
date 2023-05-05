package ru.skypro.homework.springboot.hw_springboot.service;

import ru.skypro.homework.springboot.hw_springboot.employee.Employee;

import java.util.List;

public interface EmployeeService {

    int getSumAllEmployee();

    Employee getEmployeeMinSalary();

    Employee getEmployeeMaxSalary();

    List<Employee> getAllEmployeeHaveSalaryUpAverage();
}
