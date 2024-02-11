import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        float first = input.nextFloat();
        System.out.println("Now, Enter the second number: ");
        float second = input.nextFloat();
        double product = first * second;
        System.out.println("Product is: "+ product);

    }
}
