package day09_a_scanner;

import java.util.Scanner;

/*
    create Scanner object
    ask the user to enter 3 numbers
    find and print the sum of the numbers

    later divide your total into 2

    Hey now use the divided version and add 2
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Put you first number: ");
        int num1 = keyboard.nextInt();
        System.out.println("\tNumber 1: "+num1);


        System.out.print("Put you second number: ");
        int num2 = keyboard.nextInt();
        System.out.println("\tNumber 2: "+num2);

        System.out.print("Put you third number: ");
        int num3 = keyboard.nextInt();
        System.out.println("\tNumber 3: "+num3);


        int allIn = num1+num2+num3;
        System.out.println("Total: "+allIn);

        System.out.println();

        int half = allIn/2;
        System.out.println("Hulf of total: "+half);
        int plus2 = half+2;
        System.out.println("After adding 2: "+plus2);





    }
}
