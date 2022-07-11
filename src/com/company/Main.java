package com.company;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        PrintStream stream = new PrintStream(new FileOutputStream(FileDescriptor.out));


        stream.print("Enter number of names you wanna sort: \n");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[n];
        for (int i = 0; i < n; i++)
        {
            stream.print("Enter a Name: \n");
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

        stream.print("The names in alphabetical order are: : \n");
        for (int i = 0; i < n; i++)
        {
            stream.print(names[i] +"\n");
        }
        stream.close();
    }
}
