
package com.epam.development.lesson1;

public class DigitLogic {

    public boolean mainLogic(int number) {

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;

        firstDigit = number / 1000;
        secondDigit = (number - firstDigit * 1000) / 100;

        fourthDigit = (number % 10);
        thirdDigit = (number - fourthDigit) / 10 % 10;

        return (firstDigit + secondDigit == thirdDigit + fourthDigit);
    }
}

