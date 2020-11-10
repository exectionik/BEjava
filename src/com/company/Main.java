package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Main {
    public static void addIfNotExists (Integer a, List<Integer>list){

        if(list.contains(a)){
            System.out.println("toto sa uz v liste nachadza.");

        }
        else{
            list.add(a);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {

        List<Integer> pepega = new ArrayList<>();
        pepega.add(1);
        pepega.add(12);
        pepega.add(142);


       addIfNotExists(1,pepega);






    }
}