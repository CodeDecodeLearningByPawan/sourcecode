package com.pawan.kumar;

public class User {
    int age = 24;

    public static void main(String[] args) {
        User ram = new User();
        User lax = new User();
        User bharat = new User();
        System.out.println("Ram age :" + ram.age);
        ram.age=40;
        System.out.println("Ram age :" + ram.age);
        System.out.println("Lax age:"+ lax.age);
        lax.age=25;
        System.out.println("Lax age:"+ lax.age);
        System.out.println("Bharat age:"+ bharat.age);
        bharat.age=35;
        System.out.println("Bharat age:"+ bharat.age);

    }
}
