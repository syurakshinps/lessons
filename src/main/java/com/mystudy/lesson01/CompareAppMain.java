package com.mystudy.lesson01;

import com.mystudy.lesson01.packaging.Box;

public class CompareAppMain {
    public static void main(String[] args) {


        Box box1 = new Box("Green", 2);
        Box box2 = new Box("Green", 2);

        System.out.println(box1.equals(box2));

        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

        System.out.println(box1 + "\n" + box2);

        printer();
        //new CompareAppMain().printer();

    }

    public static void printer() {
        System.out.println("bla");
    }
}
