package main;

import exception.MyArrayDataException;
import exception.MyArraySizeException;

import java.util.Random;
import java.util.SplittableRandom;

public class Hometask2 {

    private boolean checkSizeOfArray (String[][] arr){
        if (arr.length!=4){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length!=4){
                return false;
            }
        }
        return true;
    }
    public int sumOfElements (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum =0;
        if (!checkSizeOfArray(arr)){
            throw new MyArraySizeException("Size of provided array is not valid. It should be 4x4");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (!arr[i][j].matches("-?\\d+")){
                    throw new MyArrayDataException(String.format("Element at row %s, column %s is not an integer", i,j));
                }
                sum+=Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }
    public String[][] provideArray (int rows, int columns){
        String[][] arr = new String[rows][columns];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = Integer.toString(random.nextInt(20));
            }
        }
        return arr;
    }
}
