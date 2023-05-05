package ru.skypro.homework.springboot.hw_springboot.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.springboot.hw_springboot.employee.Employee;
import ru.skypro.homework.springboot.hw_springboot.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public int getSumAllEmployee() {
        return employeeRepository.getSumAllEmployee();
    }

    @Override
    public Employee getEmployeeMinSalary() {
        return employeeRepository.getEmployeeMinSalary();
    }

    @Override
    public Employee getEmployeeMaxSalary() {
        return employeeRepository.getEmployeeMaxSalary();
    }

    @Override
    public List<Employee> getAllEmployeeHaveSalaryUpAverage() {
        return employeeRepository.getAllEmployeeHaveSalaryUpAverage();
    }
}
