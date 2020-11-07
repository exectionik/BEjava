package com.company;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr={1,1,1,2,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        list.forEach((n) -> {
            if(list.isEmpty())
                System.out.println("list je prazdny.");
            else
            System.out.println(n);
        });





    }
}