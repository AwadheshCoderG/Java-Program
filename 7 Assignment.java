import java.util.Scanner;
class Assignment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.println("Enter value of A: ");
        int a = input.nextInt();
        System.out.println("Enter value of B: ");
        int b = input.nextInt();
        System.out.println("Before swapping the value of A is "+ a +" and value of B is "+ b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping the value of A is "+ a +" and value of B is "+ b);

    }
}
