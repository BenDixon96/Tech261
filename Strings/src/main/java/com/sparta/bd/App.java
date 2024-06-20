package com.sparta.bd;



public class App {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");
        String string4 = new String("hello");
        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println(string1 == string2);
        System.out.println(string3 == string4);
        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        System.out.println(System.identityHashCode(string4));





    }
}