package com.CoderG.Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int number = 9;
        System.out.println(factorial(number));
        IntStream.rangeClosed(2, number)
                .reduce((a, b) -> a*b)
                .ifPresent(System.out::println);
    }

    public static long factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }

        long fact = 1;
        for(int i = 2;  i <= number; i++){
            fact *=i;
        }
        return fact;
    }
}
