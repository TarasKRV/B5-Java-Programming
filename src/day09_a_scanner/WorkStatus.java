package day09_a_scanner;

import java.util.Scanner;
/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
public class WorkStatus {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("Enter yor first name: ");
        String fName = info.next();

        System.out.print("Enter yor last name: ");
        String lName = info.next();

        System.out.print("Are you employed? (true/false): ");
        boolean isEmployee = info.nextBoolean();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = info.nextBoolean();
        System.out.println();

        System.out.println("The person with first name "+fName+" and last name "+lName+" currently employed "+isEmployee+" and a student "+isStudent);
        }
}
