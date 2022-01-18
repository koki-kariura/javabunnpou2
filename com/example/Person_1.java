package com.example;

public class Person_1 {
    
    String gender; //性別
    public Person_1(String man) {
        gender = man;
    }


    public void speak() {
        
    if (gender.equals("男性")){
        System.out.println("I'm a man");
    } else if (gender.equals("女性")){
        System.out.println("I'm a woman");
        }
          
    }
}
