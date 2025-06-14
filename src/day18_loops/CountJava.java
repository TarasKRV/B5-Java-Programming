package day18_loops;


public class CountJava {
    public static void main(String[] args) {
        String str = "java is a nice programming language and java";

        int countJ = 0;


        for (int i = 0; i <= str.length() - 4; i++) {

            String eachCycle4Letters = str.substring(i, i + 4);



            if (eachCycle4Letters.equals("java")) {
                countJ++;
            }


        }
        System.out.println("You have: "+countJ+ " \"java\" in String.");

    }
}
