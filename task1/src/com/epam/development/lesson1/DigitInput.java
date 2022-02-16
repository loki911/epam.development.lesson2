package com.epam.development.lesson1;

import java.util.Scanner;

public class DigitInput {

    public int mainNumber() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четырехзначное положительное число: ");
        return in.nextInt();
    }
}
