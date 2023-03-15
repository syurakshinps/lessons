package com.mystudy.lesson01.hw.animal;

public class Tiger extends Animal{
    public static int count;
    public Tiger(int maxRun, int maxSwim, String name) {
        super(maxRun, maxSwim, "tiger", name);
        count++;
    }
}
