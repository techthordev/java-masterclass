package br.com.techthordev.section_05.IfKeywordAndCodeBlocks;

public class MainChallenge {

    static void main() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
