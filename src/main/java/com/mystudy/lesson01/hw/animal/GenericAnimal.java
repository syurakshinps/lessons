package com.mystudy.lesson01.hw.animal;

public class GenericAnimal extends Animal{
    public static int count;
    public GenericAnimal(int maxRun, int maxSwim, String name) {
        super(maxRun, maxSwim, "generic animal", name);
        count++;
    }
}
