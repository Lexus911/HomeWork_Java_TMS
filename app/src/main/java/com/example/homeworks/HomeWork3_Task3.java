package com.example.homeworks;

import java.util.Scanner;

public class HomeWork3_Task3 {
    public static void main(String[] args) {
    //Enter the string content
        String[] arrStr = new String[3];
        Scanner strings = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();

        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("Enter the string №" + (i + 1));
            arrStr[i] = strings.nextLine();
        }

        System.out.println(stringBuffer.append(arrStr[2]));
        System.out.println(stringBuffer1.append(arrStr[1].toLowerCase()));
        System.out.println(stringBuffer2.append(arrStr[0]).reverse());
    }

}
