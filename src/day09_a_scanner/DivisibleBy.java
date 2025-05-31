package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = keyboard.nextInt();

        boolean isDivBy2 = number % 2 == 0;
        boolean isDivBy3 = number % 3 == 0;
        boolean isDivBy5 = number % 5 == 0;

//        System.out.println("Is divisible by 2: "+isDivBy2);
//        System.out.println("Is divisible by 3: "+isDivBy3);
//        System.out.println("Is divisible by 5: "+isDivBy5);

        boolean isDivBy2_3_5 =isDivBy2 && isDivBy3 && isDivBy5;

        System.out.println();
        System.out.println("Is divisible by all 2, 3, 5: " +isDivBy2_3_5);

        System.out.println();

        boolean isOrBy2_3_5 =isDivBy2 || isDivBy3 || isDivBy5;

        System.out.println();
        System.out.println("Is divisible by one of 2 or 3 or 5: " +isOrBy2_3_5);
    }
}
