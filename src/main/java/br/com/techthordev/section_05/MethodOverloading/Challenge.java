package br.com.techthordev.section_05.MethodOverloading;

public class Challenge {
    static void main() {
        System.out.println("5ft, 8in = " + convertToCentimers(5, 8 )+ "cm");
        System.out.println("68in = " + convertToCentimers(68) + "cm");
    }

    public static double convertToCentimers(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimers(int feet, int inches) {

        // return convertToCentimers((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimers(totalInches);
        return result;
//        return convertToCentimers(totalInches);

    }

}
