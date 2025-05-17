package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char l1 = 'T';
        char l2 = 'a';
        char l3 = 'r';
        char l4 = 'a';
        char l5 = 's';

        System.out.println("first" +l1);
        System.out.println("second:" +l2);
        System.out.println("third:" +l3);
        System.out.println("fourth:" +l4);
        System.out.println("fifth:" +l5);

        System.out.println();

        System.out.println(l1+0);
        System.out.println(l2+0);
        System.out.println(l3+0);
        System.out.println(l4+0);
        System.out.println(l5+0);

        System.out.println();

        System.out.println(l1+l2+l3+l4+l5);

        System.out.println();

        String name = "" +l1+l2+l3+l4+l5;
        System.out.println(name);
    }
}
