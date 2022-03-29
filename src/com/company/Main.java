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
        float weightDifference = boxerSecond - boxerFirst;
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

        // Задача 4

        byte loseWeight = 7;
        int loseWeightInGr = 7 * 1000;
        int days250 = loseWeightInGr / 250;
        int days500 = loseWeightInGr / 500;
        System.out.println("Total days if 250 gr are " + days250);
        System.out.println("Total days if 500 gr are " + days500);
        System.out.println("On average it takes " + (days250 + days500) / 2 + " days");

        // Задача 5

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int newMasha = 67760 * 10 / 100 + 67760;
        int newDenis = 83690 * 10 / 100 + 83690;
        int newKristina = 76230 * 10 / 100 + 76230;
        int MashaYear = Masha * 12;
        int DenisYear = Denis * 12;
        int KristinaYear = Kristina * 12;
        int MashaYear10 = newMasha * 12;
        int DenisYear10 = newDenis * 12;
        int KristinaYear10 = newKristina * 12;
        int MashaNewSalary = MashaYear10 - MashaYear;
        int DenisNewSalary = DenisYear10 - DenisYear;
        int KristinaNewSalary = KristinaYear10 - KristinaYear;
        System.out.println("Masha now receives " + newMasha + " rubles. " + "Annual income increased by " + MashaNewSalary + " rubles");
        System.out.println("Denis now receives " + newDenis + " rubles. " + "Annual income increased by " + DenisNewSalary + " rubles");
        System.out.println("Kristina now receives " + newKristina + " rubles. " + "Annual income increased by " + KristinaNewSalary + " rubles");


    }
}
