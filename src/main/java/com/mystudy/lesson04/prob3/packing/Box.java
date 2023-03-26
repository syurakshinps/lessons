package com.mystudy.lesson04.prob3.packing;

import com.mystudy.lesson04.prob3.eadibles.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public abstract class Box {
    private int numberOfFruits;
    private ArrayList<Fruit> boxedFruit = new ArrayList<>();

    public Box(int numberOfFruits, ArrayList<Fruit> boxedFruit) {
        this.numberOfFruits = numberOfFruits;
        this.boxedFruit = boxedFruit;
    }

    public Box(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    public Box(ArrayList<Fruit> boxedFruit) {
        this.boxedFruit = boxedFruit;
    }

    public Box() {
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    public ArrayList<Fruit> getBoxedFruit() {
        return boxedFruit;
    }

/*    public void setBoxedFruit(ArrayList<Fruit> boxedFruit) {
        this.boxedFruit = boxedFruit;
    }*/

    public abstract void putFruit(int number);

    @Override
    public boolean equals(Object obj) {
        Box bObject = (Box) obj;
        if ((this.getBoxedFruit().size() != 0) && (bObject.getBoxedFruit().size() != 0)) {
            if (this.getNumberOfFruits() * this.getBoxedFruit().get(0).getWeight() ==
                    bObject.getNumberOfFruits() * bObject.getBoxedFruit().get(0).getWeight()) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new RuntimeException("You compare two boxes, \nbut at least one box is empty.");
        }

    }

    @Override
    public String toString() {
        if ((! this.getBoxedFruit().isEmpty())){
            return "box of " + this.boxedFruit.get(this.boxedFruit.size()-1).getKind().toLowerCase(Locale.ROOT) + "s";
        } else{
            return "it's an empty box.";
        }
    }
}
