package day08_scanner_logical_operators;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);

        System.out.print("Whats you full name: ");
        String fName = first.nextLine();
        System.out.println();

        System.out.print("What you buy first: ");
        String item1 = first.nextLine();
        System.out.println();

        System.out.print("What you buy second: ");
        String item2 = first.nextLine();
        System.out.println();

        System.out.print("What you buy third: ");
        String item3 = first.nextLine();
        System.out.println();

        double total$ = 58.5;
        int orderNum = 3;


        System.out.println("\nHello "+fName+", today you buy "+orderNum+" items: " +item1+ ", " +item2+ ", and " +item3+ ". And total price of: "+total$+"$.");

    }
}
