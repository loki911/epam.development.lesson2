package com.epam.development.lesson1;

import java.util.Scanner;

public class TriangleInput {

    public double triangleInput(int num) {

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Введите катет " + num + ": ");

        return in.nextDouble();
    }

}
