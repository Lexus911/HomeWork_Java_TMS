package com.example.homeworks;

import static java.lang.Thread.sleep;

public class HomeWork12 {
    public static void main(String[] args) {

        //Task_1 + Task_2 + Task_3

        //Creating and running a thread through inheritance from class Thread
        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();

        //Creating and running a thread through implementation of interface Runnable
        ThreadClass2 threadClass2 = new ThreadClass2();
        Thread thread = new Thread(threadClass2); //passing Runnable thread for start() to another thread (Task_3)
        thread.start();

        //Creating and running a thread through anonymous class using class Thread
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("This thread is running in Thread");
            }
        };
        thread1.start();

        //Creating and running a thread through anonymous class using interface Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5100); //This thread will start in 5,1 seconds after another threads (Task_1)
                }catch (Exception e){
                    System.out.println("Sorry, something went wrong...");
                }

                System.out.println("This thread running in Runnable");
            }
        };
        Thread thread2 = new Thread(runnable); //passing Runnable thread for start() to another thread (Task_3)
        thread2.start();
    }
}

class ThreadClass1 extends Thread{

    @Override
    public void run() {
        for(int i = 1; i < 11; i++){

            System.out.print(i + " ");
        }
    }
}

class ThreadClass2 implements Runnable{ //This thread will start in 5 seconds after another threads (Task_1)

    @Override
    public void run() {

        try {
            sleep(5000);
        }catch (Exception e){
            System.out.println("Sorry, something went wrong...");
        }

        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}

