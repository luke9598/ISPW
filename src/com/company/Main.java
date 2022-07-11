package com.company;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());

        Scanner number = new Scanner(System.in);
        logger.info("Enter number of words you wanna sort: ");

        int n = number.nextInt();

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter number of words you wanna sort: ");
        String[] names = new String[n];

        for (int i = 0; i < n; i++)
        {
            logger.info("Enter a String: ");
            names[i] = scanner.nextLine();
        }
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // compare one string with other strings
                if (names[i].compareTo(names[j]) < 0) {
                    // reverse alphabetical
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // print output array
        logger.info( "The names in alphabetical order are: ");
        List<String> list = Arrays.asList(names);
        String sortedList = list.toString();
        logger.info(sortedList);


    }
}
