package com.mystudy.lesson04;

import java.util.ArrayList;
import java.util.Arrays;

public class GenArray<T> {
    private T[] obj;

    public GenArray(T[] obj) {
        this.obj = obj;
    }

    public void swapEle(int index1, int index2) {
        T x = this.obj[index1];
        T y = this.obj[index2];
        this.obj[index1] = y;
        this.obj[index2] = x;


    }

    public T getEleByIndex(int index) {
        return this.obj[index];
    }

    public ArrayList<T> genArrayToArrayList(){
        ArrayList<T> myArr = new ArrayList<>();
        myArr.addAll(Arrays.asList(this.obj));
        return myArr;
    }
}
