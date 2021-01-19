package com.tts.main;

import javax.swing.*;
import java.awt.*;

public class BankAccount {
    private static String accountHolder;
    private static int accountNumber;
    private static double accountBalances;
    private static final BankAccount checking = new BankAccount();
    private static final BankAccount savings = new BankAccount();

    private static GUI runAccount = new GUI();
    String name;
    public static void main(String[] args) {
        checking.setAccountHolder("Bernie Mac");
        checking.setAccountNumber(1004040232);
        checking.setAccountBalances(101_210.32);
        String name = checking.getAccountHolder();
        JLabel accountNameLabel = new JLabel(name);
        int account = checking.getAccountNumber();
        JLabel accountNumberLabel = new JLabel(String.valueOf(account));
        double balance = checking.getAccountBalances();
        JLabel accountBalLabel = new JLabel(String.valueOf(balance));
        runAccount.createGUI(accountNameLabel, accountNumberLabel, accountBalLabel);


    }

    public BankAccount() { }

//    public static void labels(String name, int account, double balance){
//        name = checking.getAccountHolder();
//        JLabel accountNameLabel = new JLabel(name);
//        account = checking.getAccountNumber();
//        JLabel accountNumberLabel = new JLabel(String.valueOf(account));
//        balance = checking.getAccountBalances();
//        JLabel accountBalLabel = new JLabel(String.valueOf(balance));
//
//    }

    public static void printAccountDetails(BankAccount c) {
        System.out.println(" " + c.toString().replace("{", "").replace("}", "").replace("=", ":"));

    }

    //setters
    public void setAccountHolder(String accountHolder) { BankAccount.accountHolder = accountHolder; }

    public void setAccountNumber(int accountNumber) { BankAccount.accountNumber = accountNumber; }

    public void setAccountBalances(double accountBalances) { BankAccount.accountBalances = accountBalances; }

    //getters
    public String getAccountHolder() { return accountHolder; }

    public int getAccountNumber() { return accountNumber; }

    public double getAccountBalances() { return accountBalances; }

    @Override
    public String toString() {
        return "{" + "\n " +
                "accountHolder= " + accountHolder + '\n' +
                " accountNumber= " + accountNumber + '\n' +
                " accountBalances= " + accountBalances + '\n' +
                "}";
    }
}//end main
