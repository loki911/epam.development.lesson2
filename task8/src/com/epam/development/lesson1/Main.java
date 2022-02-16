package com.epam.development.lesson1;

public class Main {

    public static void main(String[] args) {

        ArrayInput input = new ArrayInput();
        ArrayLogic logic = new ArrayLogic();
        ArrayOutput output = new ArrayOutput();

        int n = input.sizeInput();
        int k = input.dividerInput();
        int[] array = input.arrayInput(n);
        int sum = logic.arrayLogic(array, k);
        output.arrayOutput(sum, k);
    }
}