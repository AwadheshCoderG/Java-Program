import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator");
        System.out.println("Please enter your principle amount: ");
        int principle = input.nextInt();
        System.out.println("Now, please tell me your rate of interest:");
        float rate = input.nextFloat();
        System.out.println("Now, please tll me for how many years you want to borrowing this money:");
        float years = input.nextFloat();
        double compInt = principle * Math.pow((1 + rate/100),years);
        System.out.println("Your Compound Interest is Rs: "+ compInt);
    }
}
