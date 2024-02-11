package com.CoderG.Challenge103;

public class PrintNumbers implements Runnable {

    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Number is %d\n", i);

        }
    }
}
