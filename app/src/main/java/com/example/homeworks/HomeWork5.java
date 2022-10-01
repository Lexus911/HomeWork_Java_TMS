package com.example.homeworks;
        //Task_1
public class HomeWork5 {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        Phone iPhone = new Phone();
        Phone xiaomi = new Phone();

        System.out.println(samsung.number);
        System.out.println(samsung.model);
        System.out.println(samsung.weight);

        System.out.println(iPhone.number);
        System.out.println(iPhone.model);
        System.out.println(iPhone.weight);

        System.out.println(xiaomi.number);
        System.out.println(xiaomi.model);
        System.out.println(xiaomi.weight);

        samsung.receiveCall();
        samsung.getNumber();
        iPhone.receiveCall();
        iPhone.getNumber();
        xiaomi.receiveCall();
        xiaomi.getNumber();

        samsung.getNumber("Alex","+375 29 555 55 55");
        iPhone.getNumber("Andrew", "+375 44 555 33 22");
        xiaomi.getNumber("Antony", "+375 33 888 22 88");
        iPhone.sendMessage("+375 33 444 33 22");

        //Task_3
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        pigeon.fly();
        crow.fly();
    }

}
class Phone{
//variables
String number = "+375 44 555 55 55";
String model = "Unknown";
int weight = 184;
String name = "Unknown caller";

//methods
void receiveCall(){
    System.out.println(name + " is calling");
}
void getNumber(){
    System.out.println(number);
}
void getNumber(String name, String number){
    System.out.println(name + " is calling" + "\n" + number);
    }
void sendMessage(String number){
    System.out.println(number + " message successfully sent");
    }

//constructors
    public Phone(){
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
}
//Task_3
abstract class Bird{

    abstract void fly();
}

class Pigeon extends Bird{
    @Override
    void fly() {
        System.out.println("I am pigeon. I can fly!");
    }
}

class Crow extends Bird{
    @Override
    void fly() {
        System.out.println("I am crow. I can fly!");
    }
}