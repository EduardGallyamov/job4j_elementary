package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollar");
        int in1 = 70;
        int expected1 = 1;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("70 rubles are 1 euro. Test result : " + passed1);
        int in2 = 60;
        int expected2 = 1;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("60 rubles are 1 dollar. Test result : " + passed2);
    }
}