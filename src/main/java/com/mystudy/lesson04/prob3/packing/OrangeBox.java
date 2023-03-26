package com.mystudy.lesson04.prob3.packing;

import com.mystudy.lesson04.prob3.eadibles.Apple;
import com.mystudy.lesson04.prob3.eadibles.Orange;

import java.util.ArrayList;

public class OrangeBox extends Box{

    @Override
    public void putFruit(int number) {
        for (int i = 0; i < number; i++) {
            getBoxedFruit().add(new Orange());
        }
        setNumberOfFruits(getBoxedFruit().size());

    }

}
