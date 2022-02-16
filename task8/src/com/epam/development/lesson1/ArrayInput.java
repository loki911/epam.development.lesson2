package com.epam.development.lesson1;

import java.util.Scanner;

public class ArrayInput {

    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);

    public int[] arrayInput(int n) {

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
            String temp = in.next();
            for (int j = 0; j < temp.length(); j++) {
                if (!Character.isDigit(temp.charAt(j))) {
                    System.err.println("Низя");
                    i--;
                    break;
                } else {
                    array[i] = Integer.parseInt(Character.toString(temp.charAt(j)));
                }
            }
        }

        return array;
    }

    public int dividerInput() {
        System.out.println("Введите делитель k: ");
        return in.nextInt();
    }

    public int sizeInput () {
        System.out.println("Введите размер массива n: ");
        return in.nextInt();
    }
}

