package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly person = new RWOnly();

        // person.name = "p";

        person.Setters("p");
        System.out.println(person.Getters());


          }
  
}