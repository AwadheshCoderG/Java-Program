import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator ");
        System.out.println("Please enter your principle amount: ");
        int principle = input.nextInt();
        System.out.println("Now, please tell me your rate of interest:");
        float rate = input.nextFloat();
        System.out.println("Now, please tll me for how many years you want to borrowing this money:");
        float years = input.nextFloat();
        float interest = (principle * rate * years)/100;
        System.out.println("Simple interest is "+ interest +"rupee");

    }
}
