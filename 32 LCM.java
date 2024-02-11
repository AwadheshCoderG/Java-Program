import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please enter first number: ");
        int first = input.nextInt();
        System.out.println("Now, Please enter your second number: ");
        int second = input.nextInt();
        int lCM = lCM(first, second);
        System.out.println("LCM is : "+ lCM);
    }
    public static int lCM(int first,int second){
        int i = 1;
        while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;

        }
        return 0;
    }
}
