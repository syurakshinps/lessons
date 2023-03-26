package com.mystudy.lesson04.prob3.eadibles;

public abstract class Fruit {
    private String kind;
    private double weight;
    private int numberOfFruits;

    public Fruit(String kind, double weight, int numberOfFruits) {
        this.kind = kind;
        this.weight = weight;
        this.numberOfFruits = numberOfFruits;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

}
