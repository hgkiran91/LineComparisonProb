package com.bridgelabz;

public class LineComparisonProb {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 5;

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line: " + length);
    }
}
