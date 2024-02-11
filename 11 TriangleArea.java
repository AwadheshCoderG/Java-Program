import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Triangle Area Calculator");
        System.out.println("Please Enter base in cms: ");
        double base = input.nextDouble();
        System.out.println("Now, Please Enter perpendicular height in cms: ");
        double height = input.nextDouble();
        double Area = 0.5 * base * height;
        System.out.println("Area is "+ Area +" cms*cms");
    }
}
