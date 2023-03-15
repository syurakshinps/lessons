package com.mystudy.lesson02.actors;

import com.mystudy.lesson02.actions.Jumpable;
import com.mystudy.lesson02.actions.MyRunnable;
import com.mystudy.lesson02.obstacle.Obstacles;

public class Human implements MyRunnable, Jumpable {

    private int maxRunLimit = 100;
    private int maxJumpLimit = 1;
    private String name;

    private boolean canRunOn = true;
    private boolean canJumpOn = true;


    public Human(int maxRunLimit, int maxJumpLimit, String name) {
        this.maxRunLimit = maxRunLimit;
        this.maxJumpLimit = maxJumpLimit;
        this.name = name;
    }

    @Override
    public void jump() {
        if ((canRunOn) && (canJumpOn)) {
            System.out.print("Jumping Status: ");
            if (Obstacles.WALL.getLengthOrHeight() > maxJumpLimit) {
                canJumpOn = false;
                canRunOn = false;
                stop();
            } else {
                goesOn();
            }
        } else {
            System.out.println(name + " left the contest");
        }
    }

    @Override
    public void run() {
        if ((canRunOn) && (canJumpOn)) {
            System.out.print("Running Status: ");
            if (Obstacles.RUNWAY.getLengthOrHeight() > maxRunLimit) {
                canJumpOn = false;
                canRunOn = false;
                stop();
            } else {
                goesOn();
            }
        } else {
            System.out.println(name + " left the contest");
        }
    }

    private void stop() {
        System.out.println(name + " stops. The contest is over for him");
    }

    private void goesOn() {
        System.out.println(name + " makes it");

    }
}
