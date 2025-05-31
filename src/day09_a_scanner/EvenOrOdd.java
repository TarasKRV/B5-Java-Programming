package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num1 = key.nextInt();

        boolean isEven= num1 % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println();
        System.out.println("Is your number even: "+isEven+"\n\nIs your number odd: "+isOdd);
    }
}
