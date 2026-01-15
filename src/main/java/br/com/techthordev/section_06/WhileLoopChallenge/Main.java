package br.com.techthordev.section_06.WhileLoopChallenge;

public class Main {

    static void main() {

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddcount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddcount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddcount);
        System.out.println("Total even numbers found = " + evenCount);

    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
