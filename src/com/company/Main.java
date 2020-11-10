package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Main {

    public static void main(String[] args) {

        List<Integer> pepega = new ArrayList<>();
        pepega.add(1);
        pepega.add(12);
        pepega.add(142);

        pepega.removeIf(n -> n%2==0);
        System.out.println(pepega);








    }
}