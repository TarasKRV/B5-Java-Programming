package day03_comments_escape_sequence;

public class EscapeSequanceTabAndNextLine {
    public static void main(String[] agrs) {

        // \t ---> is for one TAB what is equal to 4 spaces from beginning.
        System.out.println("This it not tabbed");
        System.out.println("    This it not tabbed");
        System.out.println("        This it not tabbed");
        System.out.println("        8 spaces");

        System.out.println("this is tabbed");
        System.out.println("\tthis is tabbed one time");
        System.out.println("\t\tthis is tabbed two times");
        System.out.println("u\t\tthis is tabbed two times");

        System.out.println("-----------------------------------------------");


        // \n -----> this is for new line
        System.out.print("This is all about NEW LINE with ESCAPE SEQUENCE.\nHere we used escape sequence\n");
        //System.out.println("Here we used escape sequence");
        System.out.println("New line");
    }
}
