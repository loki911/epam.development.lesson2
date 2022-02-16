package com.epam.development.lesson1;

public class Main {

    public static void main(String[] args) {

        DigitInput input = new DigitInput();
        DigitLogic logic = new DigitLogic();
        DigitOutput output = new DigitOutput();

        int number = input.mainNumber();
        boolean isTrue = logic.mainLogic(number);
        output.mainOutput(isTrue);
    }
}
