package com.mystudy.lesson03;

public class Tests {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        }catch (ArithmeticException e)
        {
            System.out.println(e.fillInStackTrace());
        }finally {
            System.out.println("everything's ok");
        }
        }
    }
