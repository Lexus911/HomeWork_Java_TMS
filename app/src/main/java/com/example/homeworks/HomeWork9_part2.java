package com.example.homeworks;

import java.util.Arrays;
import java.util.Random;
import static java.util.Collections.reverseOrder;

public class HomeWork9_part2 {
    public static void main(String[] args) {
        System.out.println("Task_1");
        task_1();
        System.out.println("\nTask_2");
        task_2();
        System.out.println("\nTask_3");
        task_3();
        System.out.println("\nTask_4");
        task_4();
    }

    public static void task_1(){
        int[][] numbers1 = new int[3][3];
        numbers1[0][0] = 24;
        numbers1[0][1] = 33;
        numbers1[1][0] = 11;
        numbers1[1][1] = 32;
        numbers1[0][2] = 42;
        numbers1[2][0] = 44;
        numbers1[1][2] = 56;
        numbers1[2][1] = 13;
        numbers1[2][2] = 88;

        for (int[] array1D : numbers1) {
            System.out.println(Arrays.toString(array1D));
        }
    }

    public static void task_2(){
        int[][][]numbers2 = {
                {
                        {21, 12, 33},
                        {4, 5, 6}
                },
                {
                        {77, 87},
                        {10, 11, 12, 44, 88}
                }
        };
        for(int[][] array2D : numbers2){
            System.out.println(Arrays.deepToString(array2D));
        }
        System.out.println();
        System.out.println(Arrays.deepToString(numbers2));
    }

    public static void task_3(){
        Integer[][] numbers3 = new Integer[][]{{30, 20, 40, 10},{60, 90, 70, 50}};
        Arrays.sort(numbers3[0]);
        Arrays.sort(numbers3[1], reverseOrder());

        for (Integer[] array1D : numbers3) {
            System.out.println(Arrays.toString(array1D));
        }
    }

    public static void task_4(){
        Random random = new Random();
        int[][][]numbers4 = {
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                },
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                },
                {
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)},
                        {random.nextInt(100), random.nextInt(100), random.nextInt(100)}
                }
        };
        for(int[][] array2D : numbers4){
            System.out.println(Arrays.deepToString(array2D));
        }
    }
}
