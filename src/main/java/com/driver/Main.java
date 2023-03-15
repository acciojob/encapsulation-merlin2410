package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        //r.x = 10;
        //java: x has private access in com.driver.RWOnly
        r.setter(10);
        System.out.println(r.getter());
    }
  
}