package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What the day today: ");
        String day = key.nextLine();

        System.out.print("Enter you first name: ");
        String fName = key.next();


        System.out.print("Enter you last name: ");
        String lName = key.next();

        key.nextLine(); //<-----  use this line if you have different data

        System.out.print("Please enter your address: ");
        String address = key.nextLine();

        System.out.println("Please enter you job title: ");
        String jobTitle = key.nextLine();
    }
}
