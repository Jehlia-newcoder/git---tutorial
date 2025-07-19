package ACLC;

import ACLC.BasicBankAccount.BankAccount;
import ACLC.BasicBankAccount.SavingsAccount;
import ACLC.EmployeeSysteminBank.Clerk;
import ACLC.EmployeeSysteminBank.Employee;
import ACLC.EmployeeSysteminBank.Manager;
import ACLC.Loans.CarLoan;
import ACLC.Loans.HomeLoan;
import ACLC.Loans.Loan;
import ACLC.SpecializedBankAccount.CurrentAccount;
import ACLC.SpecializedBankAccount.SpecialBankAccount;
import ACLC.SpecializedBankAccount.SpecializedSavingsAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);


    System.out.println("******************************************");
    System.out.println("WELCOME TO THE BANK!");
    System.out.println("******************************************");
    while(true){
    System.out.println("******************************************");
    System.out.println("Please enter the services you want to enter: ");
    String options = """
            1: Basic Bank Account
            2:Specialized Bank Account
            3.Loans
            4.Employee System
            """;
    System.out.println(options);
    int op = scanner.nextInt();
    switch(op){


        case 1 -> {String s1 = """
            +++++++++++++++++++++++++++++++++++++++++++++++++
            Choose which service:
            1.Bank Account
            2.Savings Account
            3.Exit
            """;
            System.out.println(s1);
            int O = scanner.nextInt();
            scanner.nextLine();
            if (O == 3){
                break;
            }
            System.out.print("Enter Account Number: ");
            String An = scanner.nextLine();
            System.out.print("Enter Balance: ");
            Double B = scanner.nextDouble();

            String ss = """
                            Choose:
                            1.Deposit
                            2.Withdraw
                            3.Exit
                            """;


            if(O == 1){
                BankAccount H = new BankAccount(An, B);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.print("Deposit: P");
                    Double D = scanner.nextDouble();
                    H.deposit(D);
                    H.displayBalance();
                }
                if(O1 == 2){
                    System.out.print("Withdraw: P");
                    Double W = scanner.nextDouble();
                    H.withdraw(W);
                    H.displayBalance();
                }
                if(O1 == 3){
                    break;
                }
                }}

            if(O == 2){
                System.out.print("Enter Interest Rate: ");
                Double R = scanner.nextDouble();
                SavingsAccount H = new SavingsAccount(An, B , R);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.print("Deposit: P");
                    Double D = scanner.nextDouble();
                    H.deposit(D);
                    H.displayBalance();
                }
                if(O1 == 2){
                    System.out.print("Withdraw: P");
                    Double W = scanner.nextDouble();
                    H.withdraw(W);
                    H.displayBalance();
                }
                if(O1 == 3){
                    break;
                }
                }}}




        case 2 -> {
            String s1 = """
            +++++++++++++++++++++++++++++++++++++++++++++++++
            Choose which service:
            1.Bank Account
            2.Savings Account
            3.Current Account
            4.Exit
            """;
            System.out.println(s1);
            int O = scanner.nextInt();
            scanner.nextLine();
            if(O == 4){
                break;
            }
            System.out.print("Enter Account Number: ");
            String An = scanner.nextLine();
            System.out.print("Enter Balance: ");
            Double B = scanner.nextDouble();

            String ss = """
                            Choose:
                            1.Deposit
                            2.Withdraw
                            3.Exit
                            """;

            if(O == 1){
                SpecialBankAccount H = new SpecialBankAccount(An, B);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.print("Deposit: P");
                    Double D = scanner.nextDouble();
                    H.deposit(D);
                    H.displayBalance();
                }
                if(O1 == 2){
                    System.out.print("Withdraw: P");
                    Double W = scanner.nextDouble();
                    H.withdraw(W);
                    H.displayBalance();
                }
                if(O1 == 3){
                    break;
                }
                }}
            if(O == 2){
                System.out.print("Interest Rate: P");
                Double IP = scanner.nextDouble();
                SpecializedSavingsAccount H = new SpecializedSavingsAccount(An, B, IP);
                while(true){
                System.out.println(ss);
                System.out.print("4.Add Interest");
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.print("Deposit: P");
                    Double D = scanner.nextDouble();
                    H.deposit(D);
                    H.displayBalance();
                }
                if(O1 == 2){
                    System.out.print("Withdraw: P");
                    Double W = scanner.nextDouble();
                    H.withdraw(W);
                    H.displayBalance();
                }
                if(O1 == 3){
                    break;
                }
                if(O1 == 4){
                    H.addInterest();
                    H.displayBalance();
                }
            }}
            if(O == 3){
                System.out.print("OverDraft: P");
                Double OD = scanner.nextDouble();
                CurrentAccount H = new CurrentAccount(An, B, OD);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.print("Deposit: P");
                    Double D = scanner.nextDouble();
                    H.deposit(D);
                    H.displayBalance();
                }
                if(O1 == 2){
                    System.out.print("Withdraw: P");
                    Double W = scanner.nextDouble();
                    H.withdraw(W);
                    H.displayBalance();
                }
                if(O1 == 3){
                    break;
                }}}}




         
        case 3 -> {
            String s3 = """
                +++++++++++++++++++++++++++++++++++++++++++++++++
                Choose which service:
                1.Loan
                2.Home Loan
                3.Car Loan
                4.Exit
                """;    
                System.out.println(s3);
                int O = scanner.nextInt();
                scanner.nextLine();
                if(O == 4){
                    break;
                } 
                System.out.print("Enter Loan Amount: P");
                Double LM = scanner.nextDouble();
                System.out.print("Enter Interest Rate: ");
                Double IR = scanner.nextDouble();
                System.out.print("Enter Duration Years: ");
                int Y = scanner.nextInt();

                String ss = """
                            Choose:
                            1.Calculate Total Repayment
                            2.Exit
                            """;

                if(O == 1){
                Loan H = new Loan(LM, IR, Y);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    System.out.println();
                    System.out.println("Total Repayment: " + H.calculateTotalRepayment());
                    System.out.println();
                }
                if(O1 == 2){
                    break;
                }}}

                if(O == 2){
                    HomeLoan H = new HomeLoan(LM, IR, Y);
                    while(true){
                    System.out.println(ss);
                    int O1 = scanner.nextInt();
                    if(O1 == 1){
                        System.out.println();
                        System.out.println("Total Repayment" + H.calculateTotalRepayment());
                        System.out.println();
                    }
                    if(O1 == 2){
                        break;
                    }}}

                if(O == 3){
                    System.out.print("Processing fees: P");
                    Double PF = scanner.nextDouble();
                    CarLoan H = new CarLoan(LM, IR, Y, PF);
                    while(true){
                    System.out.println(ss);
                    int O1 = scanner.nextInt();
                    if(O1 == 1){
                        System.out.println();
                        System.out.println("Total Repayment" + H.calculateTotalRepayment());
                        System.out.println();
                    }
                    if(O1 == 2){
                        break;
                    }}}}




        case 4 -> {
            String s4 = """
                +++++++++++++++++++++++++++++++++++++++++++++++++
                Choose Which Service:
                1.Employee
                2.Manager
                3.Clerk
                4.Exit
                """;
                System.out.println(s4);
                int O = scanner.nextInt();
                scanner.nextLine();
                if(O == 4){
                    break;
                }
                System.out.print("Enter Name: ");
                String NM = scanner.nextLine();
                System.out.print("Enter ID: ");
                String ID = scanner.nextLine();
                System.out.print("Enter Salary: P");
                Double SL = scanner.nextDouble();

                String ss = """
                            Choose:
                            1.Display employee information
                            2.Exit
                            """;

                if(O == 1){
                Employee H = new Employee(NM, ID, SL);
                while(true){
                System.out.println(ss);
                int O1 = scanner.nextInt();
                if(O1 == 1){
                    H.displayDetails();
                }
                if(O1 == 2){
                    break;
                }}} 
                if(O == 2){
                    System.out.print("Enter Bonus: P");
                    Double BN = scanner.nextDouble();
                    Manager H = new Manager(NM, ID, SL, BN);
                    while(true){
                    System.out.println(ss);
                    int O1 = scanner.nextInt();
                    if(O1 == 1){
                        H.displayDetails();
                    }
                    if(O1 == 2){
                        break;
                    }}}    
                if(O == 3){
                    Clerk H = new Clerk(NM, ID, SL);
                    while(true){
                    System.out.println(ss);
                    int O1 = scanner.nextInt();
                    if(O1 == 1){
                        H.displayDetails();
                    }
                    if(O1 == 2){
                        break;
                    }}}}


        default -> {
        System.out.println("Invalid input. Try again");      
        continue;
        }}
continue; 
}

}}
