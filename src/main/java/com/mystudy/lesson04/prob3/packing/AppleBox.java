package com.mystudy.lesson04.prob3.packing;

import com.mystudy.lesson04.prob3.eadibles.Apple;
import com.mystudy.lesson04.prob3.eadibles.Fruit;
import com.mystudy.lesson04.prob3.eadibles.Orange;

import java.util.ArrayList;

public class AppleBox extends Box {


    @Override
    public void putFruit(int number) {

        for (int i = 0; i < number; i++) {
            getBoxedFruit().add(new Apple());
        }
        setNumberOfFruits(getBoxedFruit().size());

    }


}
