package com.mystudy.lesson01.hw.animal;

public class Dog extends Animal{

    public static int count;

    public Dog(int maxRun, int maxSwim, String name) {
        super(maxRun, maxSwim, "dog", name);
        count++;
    }

}
