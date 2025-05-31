package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Cheese";
        int numOfSlices = 20;
        int numOfPeople = 6;


        int fullSliceForEachPerson = numOfSlices / numOfPeople;

        int leftOverSlices = numOfSlices - (numOfPeople * fullSliceForEachPerson);
        int leftOverSlices2 = numOfSlices % numOfPeople;

        String result = "We bought " +typeOfPizza+" pizza. It has " +numOfSlices+" slices and we are "+numOfPeople+" people. Each of us will get "+fullSliceForEachPerson+" full slices and there will be "+leftOverSlices2+ " slices left over";

        System.out.println(result);
    }
}
