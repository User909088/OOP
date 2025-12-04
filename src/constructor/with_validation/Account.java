package constructor.with_validation;

public class Account {
    private double account_number;
    private double balance;

    public Account(double account_number, double balance){
        if(account_number <= 0){
            System.err.println("can't be null or empty + negative");
            }
        if (balance < 0){
            System.err.println("can't be negative");
        }
        this.account_number = account_number;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account account = new Account(788790, 123);

        System.out.println("Balance: " + account.balance);
        System.out.println("AccNumber: " + account.account_number);

        // Test with invalid accountNumber
        Account account2 = new Account(0, 400.00);

        // Test with invalid balance
        Account account3 = new Account(1230000873, -200.00);
    }
}
