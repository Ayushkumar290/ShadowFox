package org.SpringLerning;

import java.util.ArrayList;
import java.util.List;

public class BankAccount{

    private String AccountHolder;
    private double balance;
    private final List<Transection> history ;
    // for Initalizing account
    public BankAccount(String AccountHolder, double balance){
        this.AccountHolder = AccountHolder;
        this.balance = balance;
        this.history = new ArrayList<>();
        history.add(new Transection("Available balance: " + balance)); // adding availiable balance
    }

    // Depositing Amount
    public void depositAmount(double amount){
        if(amount <= 0 ) {
            throw new  IllegalArgumentException("Deposit some money........");
        }
        balance += amount;
        history.add(new Transection("Deposit : "+ amount ));

    }
    //Widthdraw Amount
    public void withdrawAmount(double amount){
        if (balance <= 0) {
            throw new IllegalArgumentException("Cannot withdraw, its empty ........");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance  ........");
        }
        balance -= amount;
        history.add(new Transection(" Withdraw : "+ amount));

    }
    //for Banlance
    public double getBalance(){
        return balance;
    }

    //Showing transactions
    public List<Transection> getHistory(){
        return history;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }


}