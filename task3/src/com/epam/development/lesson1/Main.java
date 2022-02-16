package com.epam.development.lesson1;

public class Main {

    public static void main(String[] args) {

        TriangleInput input = new TriangleInput();
        TriangleLogic logic = new TriangleLogic();
        TriangleOutput output = new TriangleOutput();

        double cat1 = input.triangleInput(1);
        double cat2 = input.triangleInput(2);
        double perimeter = logic.perimeterLogic(cat1, cat2);
        double square = logic.squareLogic(cat1, cat2);
        output.perimeterOutput(perimeter);
        output.squareOutput(square);
    }
}
