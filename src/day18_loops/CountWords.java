package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = key.nextLine().trim();

        int countSpace = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                countSpace++;
            }

        }
        System.out.println("Count of spaces: " + countSpace + ".");
        System.out.println("You have " +(countSpace+1) + " words.");
    }
}
