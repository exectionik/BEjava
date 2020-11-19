package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) {

        Map<String, Integer>  mapa = new HashMap<>();
        mapa.put("Red", 1);
        mapa.put("Green", 2);
        mapa.put("Black", 3);
        mapa.put("White", 4);
        mapa.putIfAbsent("Yellow",2);
        mapa.putIfAbsent("Yellow",2);
        mapa.forEach((n,v) -> System.out.println(n+ " " + v));
    }
}