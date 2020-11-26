package com.company;

class Programmer extends Employee {

    public Programmer(float salary, int bonus) {

        super(salary, bonus, Employees_list.PROGRAMMER);
    }
    public void getInfo(){
        System.out.println(pracanti.name + "'s salary is " + (salary + bonus)+ ".");
    }
}
