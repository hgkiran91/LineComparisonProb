package com.bridgelabz;

import java.util.Random;

public class LineComparisonProb {

    static Random random = new Random();

    public static double length1() {
        int x1 = (int) Math.floor(Math.random() * 10);
        int y1 = (int) Math.floor(Math.random() * 10);
        int x2 = (int) Math.floor(Math.random() * 10);
        int y2 = (int) Math.floor(Math.random() * 10);

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line1: " + length);
        return length;
    }

    public static double length2() {
        int x1 = (int) Math.floor(Math.random() * 10);
        int y1 = (int) Math.floor(Math.random() * 10);
        int x2 = (int) Math.floor(Math.random() * 10);
        int y2 = (int) Math.floor(Math.random() * 10);

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line2: " + length);
        return length;
    }

    public static void equals() {

        //Equals method to check equality

        double lenOfLine1 = length1();
        double lenOfLine2 = length2();

        if (lenOfLine1 == lenOfLine2) {
            System.out.println("Two lengths are equal");
        } else {
            System.out.println("Two lengths are not equal");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        equals();
    }
}
