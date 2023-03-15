package com.mystudy.lesson02;

import com.mystudy.lesson02.actions.Jumpable;
import com.mystudy.lesson02.actions.MyRunnable;
import com.mystudy.lesson02.actors.Cat;
import com.mystudy.lesson02.actors.Human;
import com.mystudy.lesson02.actors.Robot;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Human h1 = new Human(1000, 1, "Peter");

        MyRunnable[] everybody = new MyRunnable[]{
                new Human(10, 1, "Peter"),
                new Human(200, 4, "Vasya"),
                new Cat(400,10, "murzik"),
                new Robot(40000,1,"verter")
        };


        for (MyRunnable e : everybody) {
            e.run();
            ((Jumpable) e).jump();
        }


    }
}
