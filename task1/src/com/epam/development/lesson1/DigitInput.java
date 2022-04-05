package com.epam.development.lesson1;

import java.util.Scanner;
import java.util.regex.*;

public class DigitInput {

    public int mainNumber() {
        boolean isInputCorrect = false;
        int output = 0;
        Pattern numberPattern = Pattern.compile("\\d{4}");
        System.out.println("Введите четырехзначное положительное число:");

        while (!isInputCorrect) {
            @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
            String userInput = in.next();

            Matcher matcher = numberPattern.matcher(userInput);
            isInputCorrect =  matcher.matches();

            if (isInputCorrect) {
                output = Integer.parseInt(userInput);
            }
            else {
                System.out.println("Введенное значение некорректно. Введите четырехзначное положительное число:");
            }
        }

        return output;
    }
}
