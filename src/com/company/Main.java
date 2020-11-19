package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;




public class Main {


    public static void main(String[] args) {

        Worker w1= new Worker("John", 18,20000);
        Worker w2= new Worker("Steve", 22,200080);
        Worker w3= new Worker("Martin", 199,210000);


    List<Worker> list = Arrays.asList(w1,w2,w3);


    System.out.println(list.stream().mapToInt(Worker::getBudget).sum());


        System.out.println(list.stream().anyMatch(worker -> worker.getName().contains("a")));






    }
}