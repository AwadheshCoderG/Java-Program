import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        System.out.println("Welcome to Perimeter Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter all 4 Sides in cms: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();
        double perimeter = first + second + third + fourth;
        System.out.println("Perimeter of Rectangle is: "+ perimeter +" cms");

    }
}
