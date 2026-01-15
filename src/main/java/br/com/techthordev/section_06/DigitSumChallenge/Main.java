package br.com.techthordev.section_06.DigitSumChallenge;

public class Main {

    static void main() {

        System.out.println("The sum of digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of digits in number 1234 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 1234 is " + sumDigits(4));
        System.out.println("The sum of digits in number 1234 is " + sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}
