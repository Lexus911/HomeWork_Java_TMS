package com.example.homeworks;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Additional_HW_Task1 {
    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(api = Build.VERSION_CODES.N)
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
        Comparator<String> stringLengthComparator = new StringLengthSort();
        Arrays.sort(arrStr, stringLengthComparator);

//Output strings with the smallest length
        System.out.println(arrStr[0]);
            for (int k = 1; k < arrStr.length; k++) {
                if(arrStr[k].length() == arrStr[0].length())
                System.out.println(arrStr[k]);
            }

//Output strings with the biggest length
        System.out.println(arrStr[arrStr.length - 1]);
            for (int l = 1; l < arrStr.length-1; l++) {
            if(arrStr[l].length() == arrStr[arrStr.length - 1].length())
                System.out.println(arrStr[l]);
        }

    }

//class for use Array.sort
    static class StringLengthSort implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return 1;
            } else {
                if (s1.length() < s2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
