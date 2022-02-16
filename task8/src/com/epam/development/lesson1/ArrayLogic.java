package com.epam.development.lesson1;

public class ArrayLogic {

    public int arrayLogic(int[] array, int k) {

        int sum = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] % k == 0){
                sum = sum + array[i];
            }
        }
    return sum;
    }
}
