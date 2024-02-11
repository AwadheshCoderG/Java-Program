import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        System.out.println("Enter temperature in F: ");
        float temp = input.nextFloat();
        float cel = (temp - 32) * 5.0f / 9.0f;
        System.out.println("Temperature in Celsius: "+ cel);
    }
}
