package com.mystudy.lesson01.packaging;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Box)) {
            return false;
        }
        Box another = (Box) obj;
        return this.color.equals(another.color) && this.size == another.size;

    }

    @Override
    public String toString(){
        return "BOX "+ color + " " + size;
    }

    @Override
    public int hashCode(){
        return color.length() * 13 + size * 71;
    }

}
