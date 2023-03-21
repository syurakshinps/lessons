package com.mystudy.lesson03;

import com.mystudy.lesson03.hw.exceptions.MyArrayDataException;
import com.mystudy.lesson03.hw.exceptions.MyArraySizeException;

import java.lang.reflect.Array;

public class MyAppHW {
    public static void main(String[] args) throws MyArrayDataException {
        int sum = 0;
        String[][] array = {{"bla", "2", "3", "4"}, {"bla", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        for (int i = 0; i < 2; i++) {
            try {
                sum = Integer.parseInt(sum + array[i][i]);
            } catch (RuntimeException e) {
                throw new MyArrayDataException();
            } finally {
                System.out.println("sum = " + sum);
                System.out.println("no sum array bad");
                System.out.println("we went on");

                try {
                    int j = 10;
                    array[j][j] = "10";
                } catch (RuntimeException e) {
                    throw new MyArraySizeException();
                } finally {
                    System.out.println("yeah ");
                }

            }


        }

    }
}