package ru.skypro.homework.springboot.hw_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.springboot.hw_springboot.employee.Employee;
import ru.skypro.homework.springboot.hw_springboot.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary/sum")
    public int getSumAllEmployee() {
        return employeeService.getSumAllEmployee();
    }

    @GetMapping("/salary/min")
    public Employee getEmployeeMinSalary() {
        return employeeService.getEmployeeMinSalary();
    }

    @GetMapping("/salary/max")
    public Employee getEmployeeMaxSalary() {
        return employeeService.getEmployeeMaxSalary();
    }

    @GetMapping("/high-salary")
    public List<Employee> getAllEmployeeHaveSalaryUpAverage() {
        return employeeService.getAllEmployeeHaveSalaryUpAverage();
    }
}
