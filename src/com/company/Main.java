package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        int num1 = 127;
        var num2 = 456;
        byte num3 = 3;
        short num4 = 234;
        long num5 = 4357L;
        float num6 = 4.34f;
        double num7 = 34.5224564;
        char num8 = 4267;
        boolean isTrue = num1 < num2;

        // Задание 2

        float boxerFirst = 78.2f;
        float boxerSecond = 82.7f;
        float sumWeight = boxerFirst + boxerSecond;
        float weightDifference = boxerSecond % boxerFirst;
        System.out.println("The total weight of athletes " + sumWeight + " kg");
        System.out.println("Athlete weight difference " + weightDifference + " kg");

        // Задача 3

        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 4;
        int sum = banana * 80 + milk * 105 + iceCream * 100 + egg * 70;
        System.out.println("Sum of the meal is " + sum + " gramm");
        float sumInKg = sum / 1000f;
        System.out.println("Sum of the meal is " + sumInKg + " kg");


    }
}
