package com.sparta.bd;


public class Program {
    public static void main(String[] args) {
        int timeOfDay = 10;
        getGreeting(timeOfDay);
    }
    public static void getGreeting(int timeOfDay){

        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
