package day09_a_scanner;

import java.util.Scanner;
/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */
public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first angle number: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        System.out.println();
        double all = first+second+third;

        boolean isTriangle = all == 180.0;

        boolean isCircle = all == 360.0;

        System.out.println("It is triangle: "+isTriangle);
        System.out.println("It is circle: "+isCircle);
    }
}
