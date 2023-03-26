package com.mystudy.lesson04.prob1_2;

public class SwapArrayElements {

    public static class Box {

    }

    public static void main(String[] args) {
        GenArray<Integer> intArray = new GenArray<>(new Integer[]{1, 2, 3});
        System.out.println(intArray.genArrayToArrayList());
        intArray.swapEle(1, 2);
        System.out.println(intArray.genArrayToArrayList());

        GenArray<String> strArray = new GenArray<>(new String[]{"bla", "bla2", "bla3"});
        System.out.println(strArray.genArrayToArrayList());
        strArray.swapEle(1, 2);
        System.out.println(strArray.genArrayToArrayList());

        GenArray<Object> objArray = new GenArray<>(new Object[]{"bla", 1, new Box()});
        System.out.println(objArray.genArrayToArrayList());
        objArray.swapEle(1, 2);
        System.out.println(objArray.genArrayToArrayList());




    }


}

