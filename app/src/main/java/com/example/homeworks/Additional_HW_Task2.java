package com.example.homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Additional_HW_Task2 {
    public static void main(String[] args) {
//Enter the number of strings
        int a;
        while (true) {
            System.out.println("Enter the desired quantity of strings:");
            Scanner quantity = new Scanner(System.in);
            try {
                a = quantity.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("It's not a number! Number required");
            }
        }

//Enter the string content
        String[] arrStr = new String[a];
        Scanner strings = new Scanner(System.in);
        float sumLengths = 0;
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("Enter the string №" + (i + 1));
            arrStr[i] = strings.nextLine();
            sumLengths += arrStr[i].length(); // sum of strings lengths
        }

        float averageLength = sumLengths/a;
        System.out.println("Average string length is " + averageLength);
        System.out.println("Strings lengths that are greater than the average string length: ");

//Output strings
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < arrStr.length; k++) {
            if(arrStr[k].length() > averageLength)
                System.out.println(stringBuilder(arrStr[k]));
        }

    }

    private static String stringBuilder(String s) {
        return s;
    }


}
