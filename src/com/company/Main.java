package com.company;
import java.util.*;



public class Main {


    public static void main(String[] args) {

        Teacher pady = new Teacher(4000,500);
        Programmer rem = new Programmer(8000,999);
        Driver vodic = new Driver(5000,88);


        vodic.getInfo();
        System.out.println();
        List<Employee> list = new ArrayList<>();
        Collections.addAll(list,pady,rem,vodic);
        list.forEach(n-> n.getInfo());
    }
}