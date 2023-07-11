package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly person = new RWOnly();

        // String name = person.member;
        // you con not directly access private variable using setters and getters function

        person.Setvariable("dasthu");
        System.out.println(person.Getvariable());


          }
  
}