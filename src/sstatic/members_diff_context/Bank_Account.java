package sstatic.members_diff_context;

public class Bank_Account {
    private int account_number;
    private double balance;
    private static String bank_name = "WWW";
    private static int interest_rate = 17;

    public Bank_Account(){
    }

    static {
        System.out.println("Bank Name: " + Bank_Account.bank_name);
        System.out.println("Interest: " + Bank_Account.interest_rate);
    }

    public Bank_Account(int account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public int getAccount_number(){
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public  double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getBank_name() {
        return bank_name;
    }

    public static void setBank_name(String bank_name) {
        Bank_Account.bank_name = bank_name;
    }

    public static int getInterest_rate() {
        return interest_rate;
    }

    public static void setInterest_rate(int interest_rate) {
        Bank_Account.interest_rate = interest_rate;
    }

    public static void main(String[] args) {
        Bank_Account account =  new Bank_Account(12, 74522.123);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Bank Number: " + account.getAccount_number());
        setBank_name("Goal");
        System.out.println("Bank Name Updated: " + Bank_Account.getBank_name());
    }
}
