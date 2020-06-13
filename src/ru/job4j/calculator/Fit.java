package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = height * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = height * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height1 = 100;
        double man = Fit.manWeight(height1);
        System.out.println("Man 100 is " + man);
        short height2 = 110;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 110 is " + woman);
    }

}