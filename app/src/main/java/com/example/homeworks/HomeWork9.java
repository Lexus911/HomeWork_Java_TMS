package com.example.homeworks;

import java.util.Arrays;


import static java.util.Collections.reverseOrder;

public class HomeWork9 {
    public static void main(String[] args) {

        //Task_1
        System.out.println("Task_1");

        int[] array1 = new int[10];

        for (int i = 0, j = 2; i <= array1.length - 1; i++, j += 2) {
            array1[i] = j;
            System.out.print(array1[i] + " ");
        }

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.print("\n" + array1[i]);
        }

        //Task_2
        System.out.println("\n\nTask_2");

        Integer[] array2 = new Integer[50];

        for (int i = 0, j = 1; i <= array2.length - 1; i++, j += 2) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }

        Arrays.sort(array2, reverseOrder());
        System.out.println();

        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.print(array2[i] + " ");
        }

        //Task_3
        System.out.println("\n\nTask_3");

        int[] array3 = new int[15];
        int count = 0;

        for (int i = 0; i <= array3.length - 1; i++) {
            array3[i] = (int) (Math.random() * 99);
            System.out.print(array3[i] + " ");
            if (array3[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("\nNumber of even elements: " + count);

        //Task_4
        System.out.println("\n\nTask_4");

        int[] array4 = new int[15];

        for (int i = 0; i <= array4.length - 1; i++) {
            array4[i] = (int) (Math.random() * 20);
            System.out.print(array4[i] + " ");
            if (array4[i] % 2 != 0) {
                array4[i] = 0;
            }
        }
        System.out.println();

        for (int i = 0; i <= array4.length - 1; i++) {
            System.out.print(array4[i] + " ");
        }

        //Task5
        System.out.println("\n\nTask_5");

        int[] array5 = new int[12];

        for (int i = 0; i <= array5.length - 1; i++) {
            array5[i] = (int) (Math.random() * 15);
        }
        Arrays.sort(array5);
        int index = array5.length-1;

        System.out.print("Max element of the array is: " + array5[array5.length-1] + "\n" +
                "Index of his last entry is: " + index);

        //Task_6
        System.out.println("\n\nTask_6");

        int[] array6 = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorted = false;
        int buffer;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array6.length-1; i++){
                if(array6[i] > array6[i+1]){
                    isSorted = false;

                    buffer = array6[i];
                    array6[i] = array6[i+1];
                    array6[i+1] = buffer;
                }
            }
        }
        System.out.print(Arrays.toString(array6));

        //Task_7
        System.out.println("\n\nTask_7");

        int[] array7 = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};

        for(int i = 0; i <= array7.length-1; i++){
            int current = array7[i];
            int newValue = i-1;

            while(newValue >= 0 && current < array7[newValue]){
                array7[newValue+1] = array7[newValue];
                newValue--;
            }
            array7[newValue+1] = current;
        }
        System.out.print(Arrays.toString(array7));
    }
}
