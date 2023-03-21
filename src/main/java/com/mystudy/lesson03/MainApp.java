package com.mystudy.lesson03;

public class MainApp {

    public static void main(String[] args) {

        String s = null;
        System.out.println(s.toLowerCase()); // NullPointerException
        a(); //StackOverflowError*/


    }

    static void a() {
        a();
    }
}
