package com.company;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>() ;
//
//        Logger logger = Logger.getLogger(Main.class.getName());
//
//        list.add("luca");
//        list.add("pietro");
//        list.add("alessandro");
//        list.add("vincenzo");
//
//        String curliest = list.toString();
//        logger.info(curliest);
//
//        Collections.sort(list);
//
//        String change = list.toString();
//        logger.info(change);


//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter a string value: ");
//                String str = sc.nextLine();
//                char charArray[] = str.toCharArray();
//                Arrays.sort(charArray);
//                System.out.println(new String(charArray));



        // create string array called names
//        String names[]
//                = { "AaA" ,"Rahul", "Ajay", "Gourav", "Riya" ,"zZ"};
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number of words you wanna sort: ");
        int n = number.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String[] names = new String[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Please enter number");
            names[i] = scanner.nextLine();
        }
        String temp;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // to compare one string with other strings
                if (names[i].compareTo(names[j]) < 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // print output array
        System.out.println(
                "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }


    }
}
