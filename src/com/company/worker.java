package com.company;

public class worker {
    private String name;
    private int age;
    private int budget;

    public worker(String name,int age,int budget){
        this.name=name;
        this.age=age;
        this.budget=budget;

    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public int getAge() {
        return age;
    }
}
