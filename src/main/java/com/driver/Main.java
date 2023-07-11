package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly person = new RWOnly();

        // p.name = "p";

        person.Setters("p");
        System.out.println(person.Getters());


          }
  
}