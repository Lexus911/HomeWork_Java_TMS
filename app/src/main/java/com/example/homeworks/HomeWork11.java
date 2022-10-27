package com.example.homeworks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Comparator;

public class HomeWork11 {

    public static void main(String[] args) {

        //Task_1
        Child child = new Child("Alex", 15, 175);
        GrowingUp<Child,Adult> growingUp;
        growingUp = adult -> new Adult("Alex", 31, 191);
        Adult adult = growingUp.grewUp(child);
        System.out.println(adult.toString());

        //Task_2
        ArrayList<Adult> adults = new ArrayList<>();
        adults.add(new Adult("Andrew", 34, 188));
        adults.add(new Adult("Ashley", 24, 172));
        adults.add(new Adult("Vlad", 574, 184));
        adults.add(new Adult("Ann", 34, 168));

        @SuppressWarnings("OptionalGetWithoutIsPresent")
        String oldestAdult = adults.stream()
                .skip(1)
                .limit(2)
                .max(Comparator.comparing(Adult::getAge))
                .get().getName();
                System.out.print("The oldest adult in the room is " + oldestAdult);
        }
    }

class Child{
     final String name;
     final int age;
     final int height;

    public Child(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class Adult{
     final String name;
     final Integer age;
     final int height;

    public Adult(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    @NonNull
    @Override
    public String toString() {
        String str = "The child becomes an adult";
        return str + ": " + name + ", age - " + age + ", height - " + height + ".";
    }
}

@FunctionalInterface
interface GrowingUp<T, R> {
    R grewUp(T t);
}