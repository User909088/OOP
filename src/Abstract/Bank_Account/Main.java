package Abstract.Bank_Account;
abstract class Bank_Account{
    private final String account_number;
    private double balance;

    public Bank_Account(String account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
}

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

//subclasses


class Savings_Account extends Bank_Account{
 public Savings_Account(String account_number, double balance){
     super(account_number, balance);

 }

    @Override
    public void deposit(double amount) {
     setBalance(getBalance() + amount);
        System.out.println("Deposited" + amount + getBalance());
    }

    @Override
    public void withdraw(double amount) {
   if (getBalance() >= amount){
       setBalance(getBalance() - amount);
       System.out.println("Withdrawn" + amount + getBalance());
   }
   else {
       System.out.println("insufficient funds");
   }

    }
}

class Current_Account extends Bank_Account{
    public Current_Account(String account_number, double balance){
        super(account_number, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited" + amount + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn" + amount + getBalance());
        }
        else {
            System.out.println("insufficient funds");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Bank_Account s = new Savings_Account("6O87E", 45000);
        Bank_Account c = new Current_Account("7T04A", 100000);
        s.deposit(45000);
        s.withdraw(10000);

        System.out.println();
        System.out.println("Savings Account:\n" + "Account Number: " + s.getAccount_number() + "\n" + "Balance" + s.getBalance());

        System.out.println();
        c.withdraw(100000);
        c.deposit(65000);

        System.out.println();
        System.out.println("Current Account:\n" + "Account Number: " + c.getAccount_number() + "\n" + "Balance" + c.getBalance());

    }
}
