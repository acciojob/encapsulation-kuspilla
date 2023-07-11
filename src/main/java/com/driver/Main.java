package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly person = new RWOnly();

        // String name = person.member;

        person.Setvariable("p");
        System.out.println(person.Getvariable());


          }
  
}