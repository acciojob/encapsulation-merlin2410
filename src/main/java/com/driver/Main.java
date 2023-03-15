package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        //r.name = 10;
        //java: x has private access in com.driver.RWOnly
        r.setName("Merlin");
        System.out.println(r.getName());
    }
  
}