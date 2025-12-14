package encapsulation.account;
class Account{
    private String account_Number;
    private String account_Holder;
    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount_Holder() {
        return account_Holder;
    }

    public void setAccount_Holder(String account_Holder) {
        this.account_Holder = account_Holder;
    }

    public String getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account a = new Account();

        a.setAccount_Number("YT0GY21Z");
        a.setAccount_Holder("John Smith");
        a.setBalance(4500);
        System.out.println("Initial Balance" + a.getBalance() + "$");

        a.deposit(400);
        a.withdraw(2700);

        System.out.println("Account Number: " + a.getAccount_Number());
        System.out.println("Account Holder: " + a.getAccount_Holder());
        System.out.println("Balance: " + a.getBalance() + "$");
    }
}
