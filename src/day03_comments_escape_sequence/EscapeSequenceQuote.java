package day03_comments_escape_sequence;

public class EscapeSequenceQuote {
    public static void main(String[] args){
        /*
        Q: To be able to print we need double quotes. How do we print double quotes itself?
           Ex: Programming language "Java" is great one.

        // ESCAPE SEQUENCE -----> \
        // \ -----> backward slash
        // / -----> forward slash

         */


        System.out.println("Programming language Java is great one.");

        System.out.println("Programming language \"Java\" is great one.");

        /*
         Q: Sience we used backward slash or for double quotes, how do we print the backward slash itself?
           EX: Today is 05\10\2025


         */
        System.out.println("Today is 05 10 2025");
        System.out.println("Today is 05/10/2025");
        System.out.println("Today is 05\\10\\2025");
        System.out.println("Today is 05\10\\2025"); // 5\10 is LOST

        //How about if i want to print double backward slash
        System.out.println("Today is 05\\\\10\\\\2025");

        //Single quote with escape sequence
        System.out.println("Today is 05\'10\'2025");
        System.out.println("Today is 05'10'2025");
    }
}
