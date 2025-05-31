package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What is your favorite book: ");
        String book = key.nextLine();
        System.out.println();

        System.out.print("What is your age: ");
        int age = key.nextInt();
        System.out.println();

        System.out.print("What is your favorite number: ");
        int number = key.nextInt();
        System.out.println();

        System.out.println("Info you entered:");
        System.out.println("Your favorite book is "+book+", favorite number is "+number+" and your age now "+age+" years!");

    }
}
