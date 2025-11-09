/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

/**
 *
 * @author Nazwajafni
 */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class Account {
    String accNo;
    double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account No: " + accNo + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Bunga ditambahkan ke " + accNo + ": +" + interest);
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }
   
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Penarikan " + amount + " berhasil dari " + accNo);
        } else {
            System.out.println("Penarikan ditolak. Melebihi overdraft limit!");
        }
    }
}

public class MainBank {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount("SA001", 1000, 0.05),
            new CheckingAccount("CA001", 5000, 500),
            new SavingsAccount("SA002", 1500, 0.03)
        };

        System.out.println("\n=== Simulasi Penarikan ===");
        CheckingAccount ca = (CheckingAccount) accounts[1];
        ca.withdraw(2300);
        ca.display();

        System.out.println("=== Sebelum Bunga ===");
        for (Account acc : accounts) {
            acc.display();
        }

        System.out.println("\nMenambahkan bunga untuk SavingsAccount...");
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount savingsAccount) {
                savingsAccount.addInterest();
            }
        }

        System.out.println("\n=== Setelah Bunga ===");
        for (Account acc : accounts) {
            acc.display();
        }
    }
}