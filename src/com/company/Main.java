package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;




public class Main {

    public static void main(String[] args) {

        worker w1= new worker("Fero", 18,20000);
        worker w2= new worker("FerislavOhybny", 22,200080);
        worker w3= new worker("JanTvrdy", 199,210000);


    List<worker> list = new ArrayList<>();
    Collections.addAll(list,w1,w2,w3);

    System.out.println(list.stream().mapToInt((n -> n.getBudget())).sum());









    }
}