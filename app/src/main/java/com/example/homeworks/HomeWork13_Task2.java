package com.example.homeworks;

public class HomeWork13_Task2 {

    public static void main(String[] args) {

        Store2 store2 = new Store2();
        Producer2 producer2 = new Producer2(store2);
        Consumer2 consumer2 = new Consumer2(store2);
        new Thread(producer2).start();
        new Thread(consumer2).start();

    }
}

class Producer2 implements Runnable{

    Store2 store2;
    Producer2(Store2 store2){
        this.store2 = store2;
    }
    @Override
    public void run() {
        for(int i = 1; i < 11; i++){
            store2.put();
        }
    }
}

class Consumer2 implements Runnable{

    Store2 store2;
    Consumer2(Store2 store2){
        this.store2 = store2;
    }
    @Override
    public void run() {
        for(int i = 1; i < 6; i++){
            store2.get();
        }
    }
}

class Store2 {
    private int product = 0;
    private final int productPrice = 100;
    private int producerAccount = 0;
    synchronized void get() {
        while (product < 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interrupted");
            }
        }

        product--;
        producerAccount += productPrice;
        System.out.println("consumer bought 1 product");
        System.out.println("Producer account balance: " + producerAccount);
        System.out.println("products in stock: " + product);

        product--;
        System.out.println("Nobody buys this product. The product thrown away");
        System.out.println("products in stock: " + product);
        System.out.println("Producer account balance: " + producerAccount);
        notify();
    }

    synchronized void put(){
        while (product == 2){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.print("get interrupted");
            }
        }
        product++;
        System.out.println("producer made 1 product");
        System.out.println("products in stock: " + product);
        notify();
    }
}