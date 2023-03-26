package com.mystudy.lesson04.prob3;

import com.mystudy.lesson04.prob3.eadibles.Fruit;
import com.mystudy.lesson04.prob3.eadibles.Orange;
import com.mystudy.lesson04.prob3.packing.AppleBox;
import com.mystudy.lesson04.prob3.packing.Box;
import com.mystudy.lesson04.prob3.packing.OrangeBox;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        Box appleBox = new AppleBox();
        appleBox.putFruit(150);
        Box orangeBox = new OrangeBox();
        orangeBox.putFruit(100);

        Box orangeBox2 = new OrangeBox();

        compareBoxes(appleBox,orangeBox2);
        compareBoxes(appleBox,orangeBox);




    //    System.out.println(orangeBox2);

    }
    public static void compareBoxes(Box box1, Box box2){
            try{
                if (box1.equals(box2)){
                        System.out.println("You compare a specific "  + box1  + " and a specific " + box2 + ".\n"
                                + "They weigh the same.");
                    } else {
                        System.out.println("You compare a specific "  + box1 + " and a specific" + box2 + "\n"
                                + "They weigh differently.");
                    }
                } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
    }
}
