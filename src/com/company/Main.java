package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;

        Logger logger = Logger.getLogger(Main.class.getName());

        list.add("luca");
        list.add("pietro");
        list.add("alessandro");
        list.add("vincenzo");

        String curliest = list.toString();
        logger.info(curliest);

        Collections.sort(list);

        String change = list.toString();
        logger.info(change);
    }
}
