package com.tts.main;
import java.awt.*;
import javax.swing.*;
import com.tts.main.BankAccount;

public class GUI extends BankAccount{
    //GUI variables
    JFrame frame = new JFrame("Best Federal Credit Union");
    JPanel panel = new JPanel();
    private BankAccount checking;
    JLabel accountNameLabel = new JLabel();
    JLabel accountNumLabel = new JLabel();
    JLabel accountBalanceLabel = new JLabel();
    JLabel nameOnAccount = new JLabel("Account Holder");
    JLabel accountNum = new JLabel("Account Number");
    JLabel accountBalance = new JLabel("Account Balance");

    public static void main(String[] args) {

    }

    public GUI(){

    }

    public void createGUI(JLabel name, JLabel account, JLabel balance){
    frame.setSize(500,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    panel.setLayout(new GridLayout(3,3));
    nameOnAccount.setBounds(10, 20, 80, 25);
    accountNameLabel.setBounds(100,20,165,25);
    panel.add(nameOnAccount);
    panel.add(name);
    accountNum.setBounds(10,50, 80,25);
    accountNumLabel.setBounds(100,50,165,25);
    panel.add(accountNum);
    panel.add(account);
    accountBalance.setBounds(10,80,80,25);
    accountBalanceLabel.setBounds(100,80,165,25);
    panel.add(accountBalance);
    panel.add(balance);
    frame.setVisible(true);
}

}
