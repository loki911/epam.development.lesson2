package com.epam.development.lesson1;

public class TriangleLogic {

    public double perimeterLogic(double cat1, double cat2) {

       return cat1 + cat2 + Math.sqrt(cat1 * cat1 + cat2 * cat2);

    }

    public double squareLogic(double cat1, double cat2) {

        return cat1 * cat2 / 2;
    }
}
