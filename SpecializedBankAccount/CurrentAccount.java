package ACLC.SpecializedBankAccount;

public class CurrentAccount extends SpecialBankAccount {
        double overdraftLimit;
    
        public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }
    
        @Override
        public void withdraw(double amount) {
            if (this.balance > amount){
                this.balance -= amount;
            } 
            else if(amount <= (this.balance + this.overdraftLimit) ){
                    double huh = this.balance+ this.overdraftLimit;
                    double heh = amount - huh;
                    this.balance = heh;
                }
            else {
                System.out.println("Exceeds overdraft limit or invalid amount.");
            }}}

