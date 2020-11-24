package com.company;

public class Teacher {
    private float salary;
    private int bonus;

    public Teacher(float salary,int bonus){

        this.salary=salary;
        this.bonus=bonus;

    }
    public Teacher(){
    }

    public float getSalary() {
        return salary;
    }
    public int getBonus(){
        return bonus;
    }

    public void getInfo() {
        System.out.println("Teacher’s salary is " + salary + " and bonus is " + bonus+ ".");
    }
}
