package day45_functions_stream.functional_interface;

import my_util.FunctionsUtil;

import java.util.function.Consumer;

/*
    Consumer <T>
        - The abstract method in this functional interface:
            - it accepts ONE any type of object
            - it returns void (does not return any value)

            - void accept(T t);
 */
public class UseConsumer {
    public static void main(String[] args) {
        // LAMBDA EXPRESSION ---- > () -> {}

        Consumer <Integer> printNumbers = (num) -> {
            for (int i = 0; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        };


        printNumbers.accept(5);

        System.out.println("***************************************");
        FunctionsUtil.printNumbers.accept(5);

    }
}