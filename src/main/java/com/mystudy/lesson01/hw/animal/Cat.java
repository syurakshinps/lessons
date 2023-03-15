package com.mystudy.lesson01.hw.animal;

public class Cat extends Animal{
public static int count;
    public Cat(int maxRun, int maxSwim, String name) {
        super(maxRun, maxSwim, "cat", name);
        count++;
    }

    public int getCounterCat() {
        return count;
    }

    @Override
    public void swim(int distance){
        if (distance <= 0 ){
            System.out.println("invalid distance");
        }
        else {
            System.out.println(this.kind + " " + this.name + " didn't swim because cats don't swim");
        }
    }

}
