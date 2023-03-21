package com.mystudy.lesson03.hw.exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{

    public MyArraySizeException() {
        System.out.println("неправильный размер массива");

    }
}
