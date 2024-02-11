package com.CoderG.Challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            FactorialCalculator task = new FactorialCalculator(i);
            list.add(service.submit(task));
        }

        for (Future<Integer> integerFuture : list) {
            System.out.printf("\n Result is: %d", integerFuture.get());
        }
        service.shutdown();

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\nEmergency Shutdown");
            service.shutdownNow();}
    }
}
