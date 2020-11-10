package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;




public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>() ;
        Collections.addAll(list, 1, 1, 1, 2, 2, 3, 4, 5);

        list.forEach((n) -> System.out.println(n * list.size()));












    }
}