package com.mystudy.lesson01.hw.animal;

public abstract class Animal {
    protected int maxRun;
    protected int maxSwim;
    public static int counterAnimal;
    protected String kind;
    protected String name;


    public Animal(int maxRun, int maxSwim, String kind, String name) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counterAnimal++;
        this.kind = kind;
        this.name = name;
    }



    public String getKind() {
        return kind;
    }

    public void run(int distanceRun) {
        if (distanceRun <= 0 ){
            System.out.println("invalid distance");
        }
        if (distanceRun > maxRun){
            System.out.println(kind + " " + name + " couldn't run the distance");
        }
        else {
            System.out.println(kind + " " + name + " run " + distanceRun + " meters");
        }
    }




    public void swim(int distanceSwim) {
        if (distanceSwim <= 0 ){
            System.out.println("invalid distance");
        }
        if (distanceSwim > maxSwim){
            System.out.println(kind + " " + name + " couldn't swim the distance");
        }
        else {
            System.out.println(kind + " " + name + " swam " + distanceSwim + " meters");
        }

    }

}
