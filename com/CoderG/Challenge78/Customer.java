package com.CoderG.Challenge78;

public class Customer {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("001", "Awadhesh");

        System.out.println(account.withDrawMoney(2000));

    }
}
