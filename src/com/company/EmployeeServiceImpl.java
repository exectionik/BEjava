package com.company;

import com.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public float sumOfSalaries(List<Employee> list) {
        return (float) list.stream().mapToDouble(n -> n.getSalary()).sum();

    }

    @Override
    public int sumOfBonuses(List<Employee> list) {
        return list.stream().mapToInt(n -> n.getBonus()).sum();
    }
}
