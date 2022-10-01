package com.example.homeworks;
import java.util.Locale;

public class HomeWork3 {
        public static void main(String[] args) {
            //Task_1
            System.out.println("Task_1");
            for(int a = 7; a < 100; a+=7){
                System.out.print(a + " ");
            }

            //Task_2
            System.out.println("\nTask_2");
            for(int b = 1; b < 16; b++){
                if(b == 7) {
                    System.out.println("We are opening the " + b + "th box and...Congratulations! You have won an iPhone:)");
                }
                else
                    System.out.println("We are opening the " + b + "th box and...Sorry, this is an empty box:(");
            }

            //Task_3
            System.out.println("Task_3");
            String s1 = "I am Android developer";
            for(int c = 0; c < s1.length(); c++){
                System.out.println(s1.charAt(c));
            }

            //Task_4
            System.out.println("Task_4");
            String s2 = "I am iOS developer";
            System.out.println(s2.replace("iOS", "Android"));

            //Task_6
            System.out.println("Task_6");
            String s3 = "Information technology";
            for(int d = 1; d <= 10; d++){
                if(d % 2 == 0) {
                    System.out.println(s3.toUpperCase(Locale.ROOT));
                }
                else
                    System.out.println(s3);
            }

            //Task_7
            System.out.println("Task_7");
            String s4 = "I am Android developer";
            System.out.println(s4.substring(5,12));

            //Task_5
            System.out.println("Task_5");
            HomeWork3 count = new HomeWork3();
            count.countCounter();
        }
        void countCounter(){
            for (int count = 1; count <= 20; count++) {
                System.out.println("I was called " + count + " time(s)");
            }
        }
    }


