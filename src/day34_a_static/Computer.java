package day34_a_static;

public class Computer {

    double price;
    String brand;
    String color;


   static boolean hasScreen;
   static boolean hasBattery;
   static boolean hasMemory;

   static {
       hasScreen = true;
       hasBattery = true;
       hasMemory = true;
   }

    public Computer(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", Has screen: " + hasScreen +
                ", Has battery: " + hasBattery +
                ", Has memory: " + hasMemory +
                '}';
    }
}
