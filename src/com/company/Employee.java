package com.company;


public class Employee {
    protected float salary;
    protected int bonus;
    Employees_list pracanti;

    public Employee(float salary,int bonus,Employees_list pracanti){

        this.pracanti=pracanti;
        this.salary=salary;
        this.bonus=bonus;

    }

    public void getInfo() {
        System.out.println(pracanti.name + "'s salary is " + salary + " and bonus is " + bonus+ ".");
    }
}
