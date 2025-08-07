package day40_exception.recap;

public class UsingThrows {
    public static void main(String[] args) {

        wait1(2000);

        //wait2(2000);

        try {
            wait2(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void wait1 (int millSec) {

        try {

            Thread.sleep(millSec);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void wait2 (int millSec) throws InterruptedException{
        Thread.sleep(millSec);
    }
}
