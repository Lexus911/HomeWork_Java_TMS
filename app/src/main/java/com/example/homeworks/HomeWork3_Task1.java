package com.example.homeworks;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork3_Task1 {

    @SuppressLint("SuspiciousIndentation")
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
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("Enter the string №" + (i + 1));
            arrStr[i] = strings.nextLine();
        }

//Sort array of strings
        Arrays.sort(arrStr);

//Output strings with the smallest length
        System.out.println("The smallest string: " + arrStr[0] + ", its length is: " + arrStr[0].length());
            for (int k = 1; k < arrStr.length; k++) {
                if(arrStr[k].length() == arrStr[0].length())
                System.out.println("The smallest string: " + arrStr[k] + ", its length is: " + arrStr[k].length());
            }

//Output strings with the biggest length
        System.out.println("The biggest string: " + arrStr[arrStr.length - 1] + ", its length is: " + arrStr[arrStr.length - 1].length());
            for (int l = 0; l < arrStr.length-1; l++) {
            if(arrStr[l].length() == arrStr[arrStr.length - 1].length())
                System.out.println("The biggest string: " + arrStr[l] + ", its length is: " + arrStr[l].length());
        }
    }
}
