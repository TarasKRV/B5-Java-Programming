package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter price for item:");
        double price = key.nextDouble();

        System.out.println("\tPrice of one item: "+price+"$");
        System.out.println();

        System.out.print("Please, enter quantity of the item: ");
        int quantity = key.nextByte();
        System.out.println("\tQuantity of items: "+quantity);

        System.out.println();
        double revenue = quantity * price;
        System.out.println("Revenue value: "+revenue);



    }
}
