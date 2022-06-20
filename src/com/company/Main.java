package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;

        list.add("luca");
        list.add("pietro");
        list.add("alessandro");
        list.add("vincenzo");

        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
