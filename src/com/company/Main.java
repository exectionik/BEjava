package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        Integer[] arr={1,1,1,2,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> hSet = new HashSet<>(list);

        hSet.forEach(System.out::println);
        hSet.add(1);
        hSet.forEach(System.out::println);



    }
}