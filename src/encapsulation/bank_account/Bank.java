package encapsulation.bank_account;

class Bank_Account{
    private String account_number;
    private double balance;

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}



public class Bank {
    public static void main(String[] args) {
        Bank_Account bank = new Bank_Account();
        bank.setAccount_number("Ad3s");
        bank.setBalance(78962.21);

        System.out.println("Account number: " + bank.getAccount_number());
        System.out.println("Balance: " + bank.getBalance());

    }
}
