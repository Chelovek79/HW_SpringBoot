package ru.skypro.homework.springboot.hw_springboot.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.homework.springboot.hw_springboot.employee.Employee;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList = List.of(
            new Employee("Савченко А.А.", 55_000),
            new Employee("Васильева Е.А.", 60_000),
            new Employee("Антошина О.В.", 70_000),
            new Employee("Тропников С.Г.", 70_000),
            new Employee("Елизарова С.Н.", 80_000),
            new Employee("Каратаев И.Н.", 45_000));

    @Override
    public int getSumAllEmployee() {
        return employeeList.stream()
                .mapToInt(x -> x.getSalary()).sum();
    }

    @Override
    public Employee getEmployeeMinSalary() {
        return employeeList.stream()
                .reduce((a, b) -> a.getSalary() < b.getSalary() ? a : b).get();
    }

    @Override
    public Employee getEmployeeMaxSalary() {
        return employeeList.stream()
                .reduce((a, b) -> a.getSalary() > b.getSalary() ? a : b).get();
    }

    @Override
    public List<Employee> getAllEmployeeHaveSalaryUpAverage() {
        return employeeList.stream()
                .filter(x -> x.getSalary() >= (employeeList.stream()
                        .mapToInt(Employee::getSalary).sum()) / employeeList.size())
                .collect(Collectors.toList());
    }
}
