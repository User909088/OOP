package Inheritance.Bank_Account;

class Bank_Account {
    private double balance;
    private double account_number;
    private static double total_balance;


    public Bank_Account(double balance, double account_number) {
        this.balance = balance;
        this.account_number = account_number;
        total_balance += balance;
    }

    public void deposit(double amount) {
        balance += amount;
        total_balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            total_balance -= amount;
        } else
            System.out.println("Insufficient balance");
    }

    public double getTotal_balance(){
        return total_balance;
    }

    public double getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;

    }
}



    class Savings_Account extends Bank_Account {
        public Savings_Account(double balance, double account_number) {
            super(balance, account_number);
        }

        @Override
        public void withdraw(double amount) {
            if(getBalance() - amount < 100){
                System.out.println("Min balance: 100");
            }
            else
                super.withdraw(amount);
        }
    }

public class Main {
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account(1000.5, 4323);
        Savings_Account s = new Savings_Account(2000,34);
        System.out.println("AccNumber: " + b.getAccount_number());
        b.deposit(14500);
        b.withdraw(8000);
        System.out.println("Balance: " + b.getBalance());

        System.out.println("AccNum: " + s.getAccount_number());
        s.deposit(3500);
        s.withdraw(3000);
        System.out.println("Balance: " + s.getBalance());

        System.out.println("Total balance: " + b.getTotal_balance());

    }
}
