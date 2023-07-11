package com.driver;

public class RWOnly {
    private  String member = "name";

    // once declare private not directly use another package only same class use directly
   public void Setvariable( String member){
       // modify private variable suing Set variable function
       this.member = member;
   }
   public String Getvariable(){
       // access another package private variable value
       return this.member;
   }

}
