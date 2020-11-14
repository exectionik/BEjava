package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {




    public static void main(String[] args) {

        List<Integer> pepega = new ArrayList<>();
        pepega.add(1);
        pepega.add(12);
        pepega.add(142);
        pepega.add(7);

        List<Integer> neparneCisla = pepega
            .stream()
            .filter(n -> n % 2 !=0)
            .collect(Collectors.toList());
        System.out.println(neparneCisla);








    }
}