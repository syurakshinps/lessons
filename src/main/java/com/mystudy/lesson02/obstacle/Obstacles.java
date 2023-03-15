package com.mystudy.lesson02.obstacle;

public enum Obstacles {
    RUNWAY(100), WALL(2);

    private int lengthOrHeight;

    Obstacles(int lengthOrHeight) {

        this.lengthOrHeight = lengthOrHeight;
    }

    public int getLengthOrHeight() {
        return lengthOrHeight;
    }

}
