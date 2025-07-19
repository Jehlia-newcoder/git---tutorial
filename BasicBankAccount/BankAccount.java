package ACLC.BasicBankAccount;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }}

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }}

    public void displayBalance() {
        System.out.println();
        System.out.println("Balance: P" + balance);
        System.out.println();
    }}



