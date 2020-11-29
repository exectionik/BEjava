package com.company;

import com.model.Employee;
import com.model.Employees_list;

import java.util.List;

public interface EmployeeService
{
    float sumOfSalaries(List <Employee> list);
    int sumOfBonuses(List <Employee> list);
}
